package com.ersoft.nifi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ersoft.nifi.dao")
public class NifiApplication {

    public static void main(String[] args) {
        SpringApplication.run(NifiApplication.class, args);
    }

}
