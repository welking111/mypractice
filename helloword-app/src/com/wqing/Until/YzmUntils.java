package com.wqing.Until;

import java.util.Random;

public   class YzmUntils {

    //私有工具类 防止创建工具类对象
    private YzmUntils(){

    }
    //1.定义一个字符串，用来记录产生的验证码
    static String  code="";
    //2.验证码是由所有的大写字母、小写字母或者数字字符组成
    //这里先把所有的字符写成一个字符串，一会从字符串中随机找字符
    static  String data="0123456789qazwsxedcrfvtgbyhnujmikolpQWERTYUIOPLKJHGFDSAZXCVBNM";
    static   Random r=new Random();


    /**
     * 返回随即生成的验证码
     * @param n 返回验证码的位数
     * @return
     */
    public static String getYzm(int n){
        for (int i = 0; i < n; i++) {
            int index=r.nextInt(data.length());
            code +=data.charAt(index);
        }

        return code;
    }
}
