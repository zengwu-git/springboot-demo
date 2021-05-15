package com.zw.springboot.springbootdemo.controller;

import com.zw.springboot.springbootdemo.pojo.Account;
import com.zw.springboot.springbootdemo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("account")
public class TestController {
    @Autowired
    private AccountService accountService;

    @PostMapping("save")
    public   Map<String,String> sayHello(Account account){
       Map<String,String> result=new HashMap<>();
       if(accountService.save(account)>0) {
           result.put("success","员工数据添加成功");
       }else {
           result.put("error","数据添加失败");
       }
        return result;
    }


}
