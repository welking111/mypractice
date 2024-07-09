package com.wqing.test;

import com.wqing.Bean.Student;

import java.util.ArrayList;

public interface infoManger {

     default void say(){
          System.out.println("haha");
          getResule();
     };

     private  void getResule(){
          System.out.println("私有方法被调用了");

     }
     static void test3(){
          System.out.println("静态方法");
     }
     void printAllInfo(ArrayList<Student> students);

     void  printAllSeore(ArrayList<Student> students);


}
