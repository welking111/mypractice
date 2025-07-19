package com.wqing.Digui_Demo;

public class Test1 {
   //啤酒问题：啤酒2元一瓶，4个盖子可以换1瓶，2个空瓶可以换一瓶，10元能喝几瓶？
    //f(2)=1;
    public static void main(String[] args) {
        System.out.println(buy(4));
    }

    public static  Double buy(int n){
        if (n==2)
            return 1.0;
        else return buy(3*n/8)+0.5*n;

    }

}
