package com.huh;

public class Person {
    private int age;
    private String name;

    static {
        System.out.println("父类静态代码块");
    }

    {
        System.out.println("父类代码块");
    }

    public Person(){
        System.out.println("父类构造方法");
    }
}

class Student extends Person{
    static {
        System.out.println("子类静态代码块");
    }

    {
        System.out.println("子类代码块");
    }

    public Student(){
        System.out.println("子类构造方法");
    }
}
