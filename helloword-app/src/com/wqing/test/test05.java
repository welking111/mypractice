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
    }
    public static  int sum(int a,int b){
        return a+b;
    }

    public static void haha(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("haha");
        }

    }
}
