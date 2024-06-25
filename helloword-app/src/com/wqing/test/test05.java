package com.wqing.test;

import com.wqing.Until.ArraysUntils;
import com.wqing.Until.YzmUntils;

import java.util.Arrays;

public class test05 {

    public static void main(String[] args) {
haha(6);
        System.out.println(sum(78,22));
        System.out.println(YzmUntils.getYzm(5));

        int [] arr= ArraysUntils.getArrays(5);
        System.out.println(Arrays.toString(arr));


        System.out.println(add(5));
        System.out.println(add(6));
        judge(5);
        judge(0);
        judge(1);
        judge(-3);

        //需求：输出一个int类型的数组内容，要求输出格式为：[11, 22, 33, 44, 55]
        System.out.println(ArraysUntils.toString(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ArraysUntils.sortArrays(arr)));
Arrays.sort(arr);         System.out.println(Arrays.toString(arr));

    }
    public static  int sum(int a,int b){
        return a+b;
    }

    public static void haha(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("haha");
        }

    } public  static  void  judge (int n ){
    if(n%2 == 0){
        System.out.println("偶数");
    }else System.out.println("奇数");
    }
    public  static  int add(int n){
        int rs =0;
        for (int i = 1; i <=n ; i++) {
            rs+=i;
        }return rs;
    }


}
