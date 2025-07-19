package com.wqing.Thread_Demo;

public class Safe_Test {
    public static void main(String[] args) {
        Account account=new Account("ICBC-110",100000);

        new MyThread(account).start();
        new MyThread(account).start();
    }
}
