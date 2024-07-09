package com.wqing.test;


import com.wqing.Bean.Student;

import java.util.ArrayList;

class infoMangerTest {

    public static void main(String[] args) {
        ArrayList<Student> students =new ArrayList();
        students.add(new Student("费德提克","男",60));
        students.add(new Student("拉克丝","女",59));
        students.add(new Student("伊泽瑞尔","男",90));
        students.add(new Student("崔斯特","男",101));
        students.add(new Student("亚索","男",4));
        students.add(new Student("卡特琳娜","女",90));

        infoManger im1=new method1();
        im1.printAllInfo(students);
        im1.printAllSeore(students);

        System.out.println("---------------------");
        im1= new method2();

        im1.printAllInfo(students);
        im1.printAllSeore(students);

       im1.say();
       infoManger.test3();
    }


}