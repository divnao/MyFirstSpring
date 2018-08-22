package com.huh.springmybatis.dao.impl;

import com.huh.springmybatis.dao.BaseDao;
import com.huh.springmybatis.dao.CommonDao;
import com.huh.springmybatis.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * the advantage of 'extend SqlSessionDaoSupport' is
 * user can get a sql session by calling getSqlSession() method.
 *
 * @author huh
 */
@Repository("userDao")
public class UserDao extends CommonDao implements BaseDao<User> {

    public void insert(User user) {
        this.getSqlSession().insert("users.insert", user);
    }

    public void update(User user) {
        this.getSqlSession().update("users.update", user);
    }

    public void delete(Integer id) {
        this.getSqlSession().delete("users.delete", id);
    }

    public User selectOne(Integer id) {
        return this.getSqlSession().selectOne("users.selectOne", id);
    }

    public List<User> selectAll() {
        return this.getSqlSession().selectList("users.selectAll");
    }
}
