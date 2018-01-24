package me.uniauto.invoke.dynamic.example;

import java.lang.reflect.Proxy;

/**
 * Created by hardy on 2018/1/24.
 */
public class Main {
    public static void main(String[] args) {
        PersonDao personDao = new PersonImpl();
        PersonHandle personHandle = new PersonHandle(personDao);

        PersonDao poxy = (PersonDao) Proxy.newProxyInstance(personDao.getClass().getClassLoader(),personDao.getClass().getInterfaces(),personHandle);

        poxy.say();


    }

}
