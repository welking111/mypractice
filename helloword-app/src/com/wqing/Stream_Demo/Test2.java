package com.wqing.Stream_Demo;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String data="a我就是B";
      byte[] bytes=data.getBytes();
        System.out.println(Arrays.toString(bytes));

        byte[] bytes1=data.getBytes("GBK");
        System.out.println(Arrays.toString(bytes1));

        //解码
        String s1=new String(bytes1);
        System.out.println(s1);
        System.out.println(new String(bytes1,"GBK"));

        System.out.println(new String(bytes));
    }
}
