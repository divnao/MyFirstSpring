package com.huh.mybatisdemo.dao;

import com.huh.mybatisdemo.utils.Utils;
import org.apache.ibatis.session.SqlSession;


/**
 * DAO tmplate.
 *
 * @author huh
 */
public class DaoTemplate {

    /**
     * dao template, all most every dao can call this method.
     *
     * @param callback for call back in specified DAO.
     * @return the result of dao. only available when user use select.
     */
    public static Object execute(MybatisCallback callback) {
        SqlSession sqlSession = null;
        try {
            sqlSession = Utils.openSqlSession();
            Object result = callback.doInMybatis(sqlSession);
            sqlSession.commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            Utils.rollBackTx(sqlSession);
        } finally {
            Utils.closeSqlSession(sqlSession);
        }
        return null;
    }

}

