package com.wqing.test;


import java.util.Random;
import java.util.Scanner;

public class test3 extends  test2{

public  test3(){
    super("sad");
}


@Override
public void method(){
//super.method();
    System.out.println("我是子类的方法，重写了父类方法");
}

public void method(String str){
    System.out.println( "我是重载方法"+str);
}

    public void zm() {
        System.out.println("我是子类独有的方法");
    }
}
