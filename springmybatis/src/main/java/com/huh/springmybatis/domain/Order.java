package com.huh.springmybatis.domain;

import java.util.List;

public class Order {

    private Integer id;

    private String orderNo;

    private User user;

    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "[" + getId() + ", " + getOrderNo() +", " + getUser().getId() + ", " + getUser().getName() + ", " +  getUser().getAge() + "]";
    }
}
