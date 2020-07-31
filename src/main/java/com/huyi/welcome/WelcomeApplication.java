package com.huyi.welcome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WelcomeApplication {

    public static void main(String[] args) {
        System.out.println("项目启动");
        SpringApplication.run(WelcomeApplication.class, args);
        System.out.println("项目启动完成");
    }

}
