package com.wqing.test;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class test06 {
    public static void main(String[] args) {
    double  price=calculate(1000,10,"头等舱");
        System.out.println("折扣后价格为："+price);
        System.out.println("折扣后价格为："+calculate(1000,10,"经济舱"));

        int[] moneys = {100,999,50,520,1314};
        start(moneys);
    }

    private static double calculate(double price, int month, String str) {
       if (month>=5&&month<=10){
           if (Objects.equals(str, "头等舱")){
                price*=0.9;
           }else  price*=0.85;
       }else {if (Objects.equals(str, "头等舱")){
            price*=0.7;
       }else  price*=0.65;}
       return price;
    }


    //开始抽奖
    public static void start(int[] moneys){
        //1)首先，写一个循环，循环次数为数组的长度
        for (int i = 0; i < moneys.length; i++) {
            //2)每次循环，键盘录入，提示"用户录入任意键抽奖："
            while (true){
                Scanner sc = new Scanner(System.in);
                System.out.print("用户录入任意键抽奖：");
                String msg = sc.next();
                //3)随机从数组中产生一个索引，获取索引位置的元素，这个元素就表示抽的红包
                Random r = new Random();
                int index = r.nextInt(moneys.length);
                int money = moneys[index];
                if(money!=0){
                    //如果值不为0，则打印如："恭喜您，您抽中了520元"
                    System.out.println("恭喜您，您抽中了"+money+"元");
                    moneys[index] = 0;
                    break;
                }else {System.out.println("被别人抽走过了");

                    //如果值为0，则说明这个红包被抽过，重新循环到第2步，重新抽奖
                    //此时这一次抽奖机会被浪费掉了，可以把控制循环的次数自减一下
                    i--;
                }


                }int sum=0;
            for (int j = 0; j <moneys.length ; j++) {
                sum+=moneys[j];
            }
                if (sum == 0){
                    System.out.println("没有奖品de啦");
                    return;
                }


            }
        }
    }



