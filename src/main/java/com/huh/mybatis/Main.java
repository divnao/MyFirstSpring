package com.huh.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * test mybatis
 *
 * @author huh
 */
public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("first_mybatis_config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        insert(sqlSession);
//        update(sqlSession);
//        query(sqlSession);
//        queryAll(sqlSession);
        destory(sqlSession);
    }

    /**
     * query by id.
     *
     * @param sqlSession
     */
    public static void query(SqlSession sqlSession) {
        User users = sqlSession.selectOne("curd.queryUser", "李四");
        System.out.println(users.getId() + " " + users.getName());
    }

    /**
     * query all
     *
     * @param sqlSession
     */
    public static void queryAll(SqlSession sqlSession) {
        List<User> users = sqlSession.selectList("curd.queryUserList");
        for(User u : users) {
            System.out.println(u.getId() + " " + u.getName());
        }
    }

    /**
     * insert into a record.
     *
     * @param sqlSession
     */
    public static void insert(SqlSession sqlSession) {
        User user = new User();
        user.setName("aaa");
        user.setAge(1);
        System.out.println(sqlSession.insert("curd.insertUser", user));
    }

    /**
     * update table
     *
     * @param sqlSession
     */
    public static void update(SqlSession sqlSession) {
        User user = new User();
        user.setId(6);
        user.setName("Bob");
        user.setAge(10);
        System.out.println(sqlSession.update("curd.updateUser", user));
    }

    public static void destory(SqlSession sqlSession) {
        sqlSession.commit();
        sqlSession.close();
    }
}
