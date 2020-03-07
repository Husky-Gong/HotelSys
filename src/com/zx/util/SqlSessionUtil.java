package com.zx.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    private static SqlSessionFactory sqlSessionFactory=null;
    public static void init(String config) throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=null;
        InputStream stream=null;
        stream= Resources.getResourceAsStream(config);
        sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        sqlSessionFactory=sqlSessionFactoryBuilder.build(stream);
    }

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
