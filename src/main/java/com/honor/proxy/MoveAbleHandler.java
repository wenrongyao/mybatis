package com.honor.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by rongyaowen
 * on 2019/5/23.
 */
public class MoveAbleHandler implements InvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("这边是代理做的工作");
        return null;
    }
}
