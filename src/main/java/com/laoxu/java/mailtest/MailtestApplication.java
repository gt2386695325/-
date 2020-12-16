package com.laoxu.java.mailtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.laoxu.java.mailtest.dao")
public class MailtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailtestApplication.class, args);
    }

}
