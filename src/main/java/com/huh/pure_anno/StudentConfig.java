package com.huh.pure_anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    public Student getStudent() throws Exception{
        System.out.println("=====");
        Thread.sleep(5000);
        return new Student();
    }

}
