package com.hitrust.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
/*import org.springframework.boot.orm.jpa.EntityScan;*/
import org.springframework.context.annotation.ComponentScan;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;

@EntityScan(basePackages = "com.hitrust.member.entity")

@EnableJpaRepositories(basePackages = "com.hitrust.member")
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.hitrust.member"})
public class MemberWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberWebApplication.class, args);
        
    }
}