package me.uniauto.invoke.staticCode;

import me.uniauto.invoke.Shell;
import me.uniauto.invoke.Vendor;

/**
 * Created by hardy on 2018/1/24.
 */
public class BusinessAgent implements Shell{
    private Vendor vendor=new Vendor();

    @Override
    public void sell() {
        if(1==1){
            vendor.sell();
        }
        System.out.println("--代理商sell---");
    }

    @Override
    public void add() {
        System.out.println("--代理商add---");
    }
}
