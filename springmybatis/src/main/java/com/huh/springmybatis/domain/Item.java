package com.huh.springmybatis.domain;

public class Item {

    private Integer id;

    private String itemName;

    private Order order;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Integer getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public Order getOrder() {
        return order;
    }
}
