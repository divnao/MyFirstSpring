package com.huh.springmybatis.dao.impl;

import com.huh.springmybatis.dao.BaseDao;
import com.huh.springmybatis.dao.CommonDao;
import com.huh.springmybatis.domain.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("orderDao")
public class OrderDao extends CommonDao implements BaseDao<Order> {

    public void insert(Order order) {
        this.getSqlSession().insert("orders.insert", order);
    }

    public void update(Order order) {
        this.getSqlSession().update("orders.update", order);
    }

    public void delete(Integer id) {
        this.getSqlSession().update("orders.delete", id);
    }

    public Order selectOne(Integer id) {
        return this.getSqlSession().selectOne("orders.selectOne", id);
    }

    public List<Order> selectAll() {
        return this.getSqlSession().selectList("orders.selectAll");
    }
}
