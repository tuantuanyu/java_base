package me.uniauto.invoke.dynamic.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by hardy on 2018/1/24.
 */
public class PersonHandle implements InvocationHandler{
    private Object obj;

    public PersonHandle(Object obj){
        this.obj = obj;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result=null;

        result= method.invoke(obj,args);
        System.out.println("after");
        return result;
    }
}
