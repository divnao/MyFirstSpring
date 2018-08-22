package com.huh.mybatisdemo.app;

import com.huh.mybatisdemo.dao.UserDao;
import com.huh.mybatisdemo.domain.User;

public class App {
    public static void main(String[] args) throws Exception {

        UserDao dao = new UserDao();
//        User user = dao.selectOne(1);
//        System.out.println(user.getId() + ":" + user.getName() + ":" + user.getAge());

//        List<User> users = dao.selectAll();
//        for(User u : users) {
//            System.out.println(u.getId() + ":" + u.getName() + ":" + u.getAge());
//        }

        User u = new User();
        u.setName("Tom");
        u.setAge(20);
        dao.insert(u);
    }
}
