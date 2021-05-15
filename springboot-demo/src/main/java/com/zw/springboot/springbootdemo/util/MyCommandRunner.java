package com.zw.springboot.springbootdemo.util;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Runtime.getRuntime().exec("cmd   /c   start   http://localhost:8080/index.html");
    }
}
