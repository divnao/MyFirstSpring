package com.huh.mybatisdemo.domain;

import java.util.List;

/**
 * 创建类，与mysql表一一对应
 *
 * @author huh
 */
public class User {

    private Integer id;

    private String name;

    private Integer age;

    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
