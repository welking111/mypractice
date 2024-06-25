package com.wqing.test;

import java.util.Arrays;
import java.util.Random;

public class test04 {
    public static void main(String[] args) {

        //数据类型[]  数组名 = new 数据类型[长度];
        int[] arr = new int[3];

//        某部门n名员工的销售额分别是：?，请计算出他们部门的总销售额。
        Random r=new Random();
        int[] array=new int[r.nextInt(20)];
        int total=0;
        for (int i = 0; i <array.length ; i++) {
            array[i]=r.nextInt(10,200);
            System.out.print(array[i]+"\t");
        }
        for (int i = 0; i <array.length ; i++) {
            total+=array[i];
        }
        System.out.println("员工的人数：" +array.length);
        System.out.println("员工的销售总额：" +total);

        //某歌唱比赛，需要开发一个系统：可以录入6名评委的打分，录入完毕后立即输出平均分做选手得分
        int[] score =new int[3];
        for (int i = 0; i <score.length ; i++) {
            score[i]=r.nextInt(1,10);
        }
        double ave=0;
        System.out.println(score.length+"名评委的打分为");
        for (int j : score) {
            System.out.print(j + "\t");
            ave+=j;
        }
        System.out.println("选手得分：" +ave/score.length);
    }
}
