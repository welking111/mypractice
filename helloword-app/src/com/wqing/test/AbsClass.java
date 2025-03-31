package com.wqing.test;

public abstract class AbsClass implements Inter {

    public  AbsClass(){
        System.out.println("抽象类的无参数构造被执行");
    }
    @Override
    public abstract void method1() ;

   public void method2(){

    }   public abstract void method3();

}
