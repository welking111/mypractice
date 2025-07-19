package com.wqing.Thread_Demo.Thread_TZ;

public class Test {
    public static void main(String[] args) {
        Myrunnable myrunnable=new Myrunnable();
        for (int i = 0; i <100; i++) {
        new Thread(myrunnable).start();
        }
    }
}
