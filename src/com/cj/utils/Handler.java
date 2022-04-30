package com.cj.utils;

import com.cj.domain.Student;
import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Handler implements InvocationHandler {
    Object target;

    public Handler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        SqlSession session=null;
        Object obj = null;
        try {
            session = SqlSessionUtil.getSqlSession();
            obj = method.invoke(target, args);
            session.commit();
        } catch (Exception e) {
            session.rollback();
            e.printStackTrace();
        }finally {
            SqlSessionUtil.CloseSqlSession(session);
        }

        return obj;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
}
