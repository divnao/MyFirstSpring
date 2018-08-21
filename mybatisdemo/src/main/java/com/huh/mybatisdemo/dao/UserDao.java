package com.huh.mybatisdemo.dao;

import com.huh.mybatisdemo.domain.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDao {

    /**
     * insert one record into mysql.
     */
    public void insert(final User user) {
        DaoTemplate.execute(new MybatisCallback() {
            public Object doInMybatis(SqlSession sqlSession) {
                sqlSession.insert("curdUser.insert", user);
                return null;
            }
        });
    }

    /**
     * update one record in mysql.
     */
    public void update(final User user) {
        DaoTemplate.execute(new MybatisCallback() {
            public Object doInMybatis(SqlSession sqlSession) {
                sqlSession.update("curdUser.update", user);
                return null;
            }
        });
    }

    /**
     * select one record from mysql.
     */
    public User selectOne(final Integer id) {
        return (User) DaoTemplate.execute(new MybatisCallback() {
            public Object doInMybatis(SqlSession sqlSession) {
                return sqlSession.selectOne("curdUser.selectOne", id);
            }
        });
    }

    /**
     * select records from mysql.
     */
    public List<User> selectAll() {
        return (List<User>) DaoTemplate.execute(new MybatisCallback() {
            public Object doInMybatis(SqlSession sqlSession) {
                return sqlSession.selectList("curdUser.selectAll");
            }
        });
    }

}
