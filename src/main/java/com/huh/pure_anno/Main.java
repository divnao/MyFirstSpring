package com.huh.pure_anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Student.class);
        Student student = ac.getBean(Student.class);
        System.out.println(student);
    }

}
