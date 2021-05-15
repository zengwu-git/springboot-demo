package com.zw.springboot.springbootdemo.service;

        import com.zw.springboot.springbootdemo.pojo.Account;
        import com.zw.springboot.springbootdemo.util.Global;
        import com.zw.springboot.springbootdemo.mapper.AccountMapper;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import javax.mail.*;
        import javax.mail.internet.AddressException;
        import javax.mail.internet.InternetAddress;
        import javax.mail.internet.MimeMessage;
        import java.util.Properties;
        import java.util.List;
        import java.util.UUID;

@Service
public class AccountService {
    @Autowired
    private AccountMapper accountMapper;



    public int save(Account account){
        if(null==account.getId()||"".equals(account.getId())){
            account.setId(UUID.randomUUID().toString());
            return accountMapper.insert(account);
        }else {
            return accountMapper.update(account);
        }
    }



    public void mail() {
        Properties props = new Properties();
        props.setProperty("mail.smtp.auth", "true");
        props.setProperty("mail.transport.protocol", "smtp");
//        props.put("mail.smtp.host","smtp.qq.com");// QQ邮箱smtp服务器地址
        props.put("mail.smtp.host", "smtp.163.com");// 163邮箱smtp服务器地址
        Session session = Session.getInstance(props);
        session.setDebug(true);
        //查找今天过生日的员工
        List<Account> accountList = accountMapper.query();

        //发邮件给每个员工


                for (Account account : accountList) {
                    try {
                    Transport transport = session.getTransport();
                    Message msg = new MimeMessage(session);
                    //自定义发送的信息
                    msg.setSubject("生日贺卡");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("亲爱的");
                    stringBuilder.append(account.getName());
                    stringBuilder.append("你好!今天的是你的生日,公司全体员工祝你生日快乐！");
                    msg.setText(stringBuilder.toString());
                    //发件人邮箱(我的163邮箱,如果需要测试请换自己的邮箱)
                    msg.setFrom(new InternetAddress(Global.getEmail()));
                    msg.setRecipient(Message.RecipientType.TO,
                            new InternetAddress(account.getEmployeeEmail())); //收件人邮箱(我的QQ邮箱)
                    msg.saveChanges();
                    //连接邮件服务，需要授权码（授权码需登录自己的邮箱开放smtp服务获取授权码）
                    transport.connect(Global.getEmail(), Global.getPassword());
                    transport.sendMessage(msg, msg.getAllRecipients());
                    System.out.println("邮件发送成功...");
                transport.close();
                    } catch (AddressException e) {
                        e.printStackTrace();
                    } catch (NoSuchProviderException e) {
                        e.printStackTrace();
                    } catch (MessagingException e) {
                        e.printStackTrace();
                    }
            }
    }

}
