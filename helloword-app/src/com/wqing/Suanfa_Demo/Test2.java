package com.wqing.Suanfa_Demo;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] arr={1,3,5,10,14,19,21,28,33};
        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(find(arr, 99));
    }


    public  static  int find(int[] arr,int data){
        int left=0;
        int right=arr.length-1;
        while (left<=right){
            int middle=(left+right)/2;
            if(data<arr[middle]){
                right=middle-1;
            }else if(data>arr[middle]){
                left=middle+1;
            }else return middle;
        }
        return -1;
    }
}





