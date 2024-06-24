package com.wqing.Until;

import java.util.Random;

public   class YzmUntils {

    //私有工具类 防止创建工具类对象
    private YzmUntils(){

    }
    static String  code="";
    static  String data="0123456789qazwsxedcrfvtgbyhnujmikolpQWERTYUIOPLKJHGFDSAZXCVBNM";
    static   Random r=new Random();


    /**
     * 返回随即生成的验证码
     * @param a 返回验证码的位数
     * @return
     */
    public static String getYzm(int a){
        for (int i = 0; i < a; i++) {
            int index=r.nextInt(data.length());
            code +=data.charAt(index);
        }

        return code;
    }
}
