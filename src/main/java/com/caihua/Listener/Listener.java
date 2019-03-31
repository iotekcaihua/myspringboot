package com.caihua.Listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener()
public class Listener implements HttpSessionListener{
    private int conn=0;

    // Public constructor is required by servlet spec
    public Listener() {
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        conn++;
        se.getSession().getServletContext().setAttribute("conn",conn);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println(se.getSession()+"已销毁");
        conn--;
        se.getSession().getServletContext().setAttribute("conn",conn);
    }

    public int getConn(){
        return conn;
    }

}
