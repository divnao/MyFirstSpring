package com.huh.mybatisdemo.test;

import com.huh.mybatisdemo.domain.Item;
import com.huh.mybatisdemo.domain.Order;
import com.huh.mybatisdemo.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestCurd {

    @Test
    public void insert()  throws Exception{
        InputStream inputStream = Resources.getResourceAsStream( "MybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setName("Rose");
        user.setAge(18);
        sqlSession.insert("curdUser.insert", user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void update()  throws Exception{
        InputStream inputStream = Resources.getResourceAsStream( "MybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setId(1);
        user.setName("Tomas");
        user.setAge(22);
        sqlSession.insert("curdUser.update", user);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void selectOne()  throws Exception{
        InputStream inputStream = Resources.getResourceAsStream( "MybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setId(1);
        User u = sqlSession.selectOne("curdUser.selectOne", user);
        System.out.println(u.getName() + ": " + u.getAge());
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void selectAll()  throws Exception{
        InputStream inputStream = Resources.getResourceAsStream( "MybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> users = sqlSession.selectList("curdUser.selectAll");
        for (User u : users) {
            System.out.println(u.getName() + ": " + u.getAge());
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void insertToOrder()  throws Exception{
        InputStream inputStream = Resources.getResourceAsStream( "MybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Order order = new Order();
        User user = new User();
        user.setId(1);
        order.setOrderNo("No005");
        order.setUser(user);
        sqlSession.insert("curdOrder.insert", order);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void selectFromOrder()  throws Exception{
        InputStream inputStream = Resources.getResourceAsStream( "MybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Order order = sqlSession.selectOne("curdOrder.selectOne", 1);
        System.out.println(order);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void selectFromOrder2()  throws Exception{
        InputStream inputStream = Resources.getResourceAsStream( "MybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Order order2 = sqlSession.selectOne("curdOrder.selectOne2", 2);
        System.out.println(order2);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void selectFromOrderAll()  throws Exception{
        InputStream inputStream = Resources.getResourceAsStream( "MybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Order> order2 = sqlSession.selectList("curdOrder.selectAll");
        for (Order o : order2) {
            System.out.println(o);
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void selectFromUser()  throws Exception{
        InputStream inputStream = Resources.getResourceAsStream( "MybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User u = sqlSession.selectOne("curdUser.seleltOne2", 1);
        System.out.println("id\tname\tage");
        System.out.println(u.getId() + ", " + u.getName() + ", " + u.getAge());
        System.out.println("-------------");
        System.out.println("oid\torderNO");
        for (Order o : u.getOrders()) {
            System.out.println(o.getId()  + "\t " + o.getOrderNo());
        }
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void selectFromOrderOne2()  throws Exception{
        InputStream inputStream = Resources.getResourceAsStream( "MybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Order order2 = sqlSession.selectOne("curdOrder.selectOne3", 1);
        System.out.println(order2);

        for(Item item : order2.getItems()) {
            System.out.println(item.getId() + ", " + item.getItemName());
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
