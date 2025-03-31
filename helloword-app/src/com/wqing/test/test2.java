package com.wqing.test;

import java.util.Scanner;

public class test2 {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public test2(String str){
        System.out.println("有参构造函数父亲的被调用了");
        this.name=str;
        System.out.println(str);
    }
    public void method(){
        System.out.println("father method");
    };



}
