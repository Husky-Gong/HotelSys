package com.zx.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public abstract class SqlSessionUtil {
    /*
    get
     */
    private static SqlSessionFactory sqlSessionFactory = null;
    /*
    mybatis serve as JDBC
        use mybatis to CRUD
        1. get mybatis sql session
        2. sql session in mybatis meed sql session factory to initialize
     */

    /*
    initialize mybatis---->initialize sql session factory
    when serve starts-->get init method-->initialize sql session factory
     */
    public static void init(String config){
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = null;
        InputStream stream=null;
        try {
            //1. get config file
            stream = Resources.getResourceAsStream(config);
            //2. create sql session factory
            sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = sqlSessionFactoryBuilder.build(stream);
    }

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
