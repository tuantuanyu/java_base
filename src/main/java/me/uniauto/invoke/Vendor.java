package me.uniauto.invoke;

import me.uniauto.invoke.Shell;

/**
 * Created by hardy on 2018/1/24.
 */
public class Vendor implements Shell{
    @Override
    public void sell() {
        System.out.println("--商家sell---");
    }

    @Override
    public void add() {
        System.out.println("--商家add---");
    }
}
