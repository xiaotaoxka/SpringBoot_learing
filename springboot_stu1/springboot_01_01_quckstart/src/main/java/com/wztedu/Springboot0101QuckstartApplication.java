package com.wztedu;

import com.wztedu.controller.BookController;
import com.wztedu.controller.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot0101QuckstartApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Springboot0101QuckstartApplication.class, args);
        BookController bean = ioc.getBean("bookController" ,BookController.class);
        System.out.println("bean====> " + bean);
        User user = ioc.getBean(User.class);
        System.out.println("user====> " + user);
    }

}
