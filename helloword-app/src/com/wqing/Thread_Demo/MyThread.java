package com.wqing.Thread_Demo;

public class MyThread extends Thread{
private Account account;
    public MyThread(){}
    public MyThread(Account account){
        this.account=account;
    }
@Override
    public void run(){
    System.out.println(account.getMoney());
    account.drawMoney(100000);
}
}
