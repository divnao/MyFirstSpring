package com.huh.springmybatis.service;

import java.util.List;

/**
 *　baseService
 *
 * @author huh
 */
public interface BaseService<T> {
    public void insert(T t);

    public void update(T t);

    public void delete(Integer id);

    public T selectOne(Integer id);

    public List<T> selectAll();
}
