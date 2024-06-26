package com.wqing.bean;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodManager {
    private ArrayList<Food> foods;
    private Scanner sc=new Scanner(System.in);

    public void add(){
        System.out.println("===菜品上架==");
        Food food=new Food();
        food.setName("菜品1");
        foods.add(food);
    }
    public  void  view(){
        for (int i = 0; i <foods.size() ; i++) {
            Food food=foods.get(i);
            System.out.println(food.toString());

        }
    }
    public void start(){
        while (true){
            System.out.println("====欢迎进入商家后台管理系统=====");
            System.out.println("1、上架菜品（add）");
            System.out.println("2、浏览菜品（query）");
            System.out.println("3、退出系统（exit）");
            System.out.println("请您选择操作命令：");
            String command = sc.next();
        }
    }
}
