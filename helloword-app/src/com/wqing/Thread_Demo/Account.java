package com.wqing.Thread_Demo;

public class Account {
    private String cardId;    private double money;


    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public Account() {
    }

    public  synchronized void   drawMoney(double i) {

        String name = Thread.currentThread().getName();

        synchronized (this) {
            if(this.money>=i){
                System.out.println(name+"来取钱了");
                this.money-=i;
                System.out.println("取钱后剩余余额："+this.money);
            }else System.out.println("余额不足");
        }
    }
}
