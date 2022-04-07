package com.example.spring_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//标注这是一个springboot的应用：加载启动类下的所有资源
@SpringBootApplication
public class Spring01Application {
    public static void main(String[] args) {
        SpringApplication.run(Spring01Application.class, args);
    }
}
