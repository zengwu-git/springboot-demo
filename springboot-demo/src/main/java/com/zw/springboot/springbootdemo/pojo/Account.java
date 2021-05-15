package com.zw.springboot.springbootdemo.pojo;

import lombok.Data;
@Data
public class Account {
    private String id;//ID
    private String name;//姓名
    private String employeeNumber;//员工编号
    private String employeeEmail;//员工邮箱

    private String birthDate;//员工生日
}