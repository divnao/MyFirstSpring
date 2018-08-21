package com.huh.anno;

import org.springframework.beans.factory.annotation.Required;

public class Student {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    @Required
    public void setAge(int age) {
        this.age = age;
    }
}
