package com.wqing.Until;

import java.util.Random;

public class ArraysUntils {

    static Random r = new Random();

    /**
     * 返回数组的内容
     */
    public static String toSring(int[] arr) {   //数字数组
//先进行校验
        if (arr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("[ ");
        for (int i = 0; i < arr.length; i++) {


            sb.append(arr[i]).append(i == arr.length - 1 ? "" : ",");

        }
        return sb.append(" ]").toString();
    }

    public static String toSring(String[] arr) {    //整形数组
//先进行校验
        if (arr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("[ ");
        for (int i = 0; i < arr.length; i++) {


            sb.append(arr[i]).append(i == arr.length - 1 ? "" : ",");

        }
        return sb.append(" ]").toString();
    }


    /**
     * 生成指定长度的随机数字数组
     */
    public static int[] getArrays(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        return arr;
    }


    /**
     * 排序数字数组
     */
    public static int[] sortArrays(int[] arr) {
        //冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] >= arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+ 1];
                    arr[j + 1] = temp;
                }else continue;

            }
        }


        return arr;
    }
}
