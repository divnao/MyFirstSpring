package com.huh.mybatisdemo.dao;

import org.apache.ibatis.session.SqlSession;

public interface MybatisCallback {

    public Object doInMybatis(SqlSession sqlSession);

}
