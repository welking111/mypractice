package com.wqing.test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        System.out.println("helllllll");

        // 需求3：找3个整数中的较大值
        int i,j,k;
        i=150;j=20;k=30;
        int tmp;
        System.out.println((j>k?j:k)>i?(j>k?j:k):i);

        Scanner sc =new Scanner(System.in);
        int age =sc.nextInt();
        System.out.println("年龄为："+age);
        String name =sc.next();
        System.out.println("名字是:"+name);
    }
}
