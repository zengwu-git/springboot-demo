package com.zw.springboot.springbootdemo.mapper;

import com.zw.springboot.springbootdemo.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@Mapper
public interface AccountMapper {
    List<Account> query();
    int insert(Account account);
    int update(Account account);
}
