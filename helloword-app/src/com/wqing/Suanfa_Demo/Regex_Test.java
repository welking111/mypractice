package com.wqing.Suanfa_Demo;

import java.util.Scanner;

public class Regex_Test {
    public static void main(String[] args) {
        //checkPhone();
        checkMail();
    }
    public static void  checkPhone() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("输入一个手机号");
            String phone = sc.nextLine();
            if (phone.matches("1[2-9]\\d{9}")) {
                System.out.println("输入的手机号：" + phone + " 合规");//break;
            } else {
                System.out.println("输入的手机号：" + phone + " 不合法");

            }
        }
    }

    public static void  checkMail() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("输入一个邮箱地址");
            String phone = sc.nextLine();
            if (phone.matches("^(?!.*\\.\\.)(?!.*\\.$)[a-zA-Z0-9._%+-]+@(?!.*\\.\\.)(?!.*\\.$)[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                System.out.println("输入的邮箱地址：" + phone + " 合规");//break;
            } else {
                System.out.println("输入的邮箱地址：" + phone + " 不合法");

            }
        }
    }
}
