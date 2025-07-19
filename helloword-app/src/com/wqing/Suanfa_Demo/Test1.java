package com.wqing.Suanfa_Demo;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int CHISHU=0;
        int CHISHU2=0;

        int[] arr = {15, 874, 1, 8, 4, 67, 23, 54, 54, 98, 11, 77, 9999, 76};
        //   设数组中有14个数

        //一、冒泡排序
        //一共需要进行 length-1 轮
        // 第一轮比较 13次 第二轮比较12次
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {CHISHU++;
                if (arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        int[] arr2 = {15, 874, 1, 8, 4, 67, 23, 54, 54, 98, 11, 77, 9999, 76};
        //选择排序
        //每轮选择当前位置，开始找出后面的较小值与其位置交换
        //设数组长度14 则需要比较lengh-1 13次
        // 第一轮比较 13次 第二轮比较12次
        for (int i = 0; i < arr2.length-1; i++) {
            for (int j = 1+i; j <arr.length ; j++) {CHISHU2++;
                if (arr2[i]>arr2[j]){
                    int temp=arr2[j];
                    arr2[j]=arr2[i];
                    arr2[i]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println(CHISHU);
        System.out.println(CHISHU2);
    }
}
