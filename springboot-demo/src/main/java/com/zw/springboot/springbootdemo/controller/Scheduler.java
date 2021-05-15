package com.zw.springboot.springbootdemo.controller;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.zw.springboot.springbootdemo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import javax.mail.MessagingException;

/**
 * 定时器，每天查找当天员工的生日情况，找到后发贺卡送给生日员工
 */
@Component
public class Scheduler{
    @Autowired
    private AccountService accountService;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

//    //每隔2秒执行一次
//    @Scheduled(fixedRate = 2000)
//    public void testTasks() {
//        System.out.println("定时任务执行时间：" + dateFormat.format(new Date()));
//    }
//
    //每天8：30执行
    @Scheduled(cron = "0 30 8 ? * *")
    public void testTasks() throws MessagingException {
        accountService.mail();
        System.out.println("定时任务执行时间：" + dateFormat.format(new Date()));
    }


}