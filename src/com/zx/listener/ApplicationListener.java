package com.zx.listener;

import cn.hutool.core.util.StrUtil;
import com.zx.util.SqlSessionUtil;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/*
Use context listener
when server starts, listener will launch
and in contextIntialized method, call sqlsessionutil.init method
 */
@WebListener
public class ApplicationListener implements ServletContextListener {
    /**
     * 配置文件的名称
     */
    private final String CONFIG_FILE_NAME="config";

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        String config = servletContextEvent.getServletContext().getInitParameter("config");
        if(StrUtil.isBlank(config)){
            // get config file
            config = "mybatis.xml";
        }
        SqlSessionUtil.init(config);
        System.out.println("Get sql session" + SqlSessionUtil.getSqlSession());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}

