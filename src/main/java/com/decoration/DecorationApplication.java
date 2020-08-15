package com.decoration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class DecorationApplication {

    public static void main(String[] args) {
        SpringApplication.run(DecorationApplication.class, args);
    }

}
