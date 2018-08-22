package com.huh.springmybatis.service.impl;

import com.huh.springmybatis.dao.BaseDao;
import com.huh.springmybatis.domain.User;
import com.huh.springmybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl extends  BaseServiceImpl<User>  implements UserService {

    /**
     * the purpose of 'Override' setDao function is injecting a specified 'dao'.
     */
    @Override
    @Resource(name = "userDao")
    public void setDao(BaseDao dao) {
        super.setDao(dao);
    }
}
