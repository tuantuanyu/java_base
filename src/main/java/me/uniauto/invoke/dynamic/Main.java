package me.uniauto.invoke.dynamic;

import me.uniauto.invoke.Shell;
import me.uniauto.invoke.Vendor;

import java.lang.reflect.Proxy;

/**
 * Created by hardy on 2018/1/24.
 */
public class Main {

    public static void main(String[] args) {
        Shell shell = new Vendor();

        //创建中介类实例
        DynamicProxy dynamicProxy = new DynamicProxy(shell);

//        //加上这句将会产生一个$Proxy0.class文件，这个文件即为动态生成的代理类文件
//
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        //获取代理类实例sell
        Shell proxy =(Shell) (Proxy.newProxyInstance(shell.getClass().getClassLoader(),shell.getClass().getInterfaces(),dynamicProxy));
        proxy.sell();

    }

}
