package com.zkw.fedweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zkw.fedweb.dao.mapper")
public class FedWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(FedWebApplication.class, args);
    }

}
