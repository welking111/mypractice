package com.wqing.Bean;

public class Mouse extends Animal {
    public Mouse(String myName, int myid) {
        super(myName, myid);
    }
    @Override
    public void sleep(){

        System.out.println(name+"正在睡");
        System.out.println(name+"还喜欢大睡特睡");
    }
}
