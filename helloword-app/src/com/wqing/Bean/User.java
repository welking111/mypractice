package com.wqing.Bean;

public class User {static {
    System.out.println("静态代码块，只会被执行一次");
}
    public static int number;
    public String name;
    {name="默认用户";
        System.out.println("有个对象被创建了："+this);}
    public User(){
        System.out.println("无没有参数构造器被执行了");

        User.number++;
    }
    public User(String name){
        this.name=name;
        System.out.println("有参数构造器被执行了");
        User.number++;
    }
}
