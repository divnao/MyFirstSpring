package com.huh.springmybatis.dao;

import java.util.List;

public interface BaseDao<T> {

    public void insert(T t);

    public void update(T t);

    public void delete(Integer id);

    public T selectOne(Integer id);

    public List<T> selectAll();

}


