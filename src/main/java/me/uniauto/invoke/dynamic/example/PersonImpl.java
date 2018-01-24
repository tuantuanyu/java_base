package me.uniauto.invoke.dynamic.example;

/**
 * Created by hardy on 2018/1/24.
 */
public class PersonImpl implements PersonDao{


    @Override
    public void say() {
        System.out.println("------人说话-------");
    }
}
