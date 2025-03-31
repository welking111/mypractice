package com.wqing.test;

import com.wqing.Bean.Student;

import java.util.ArrayList;
import java.util.Objects;

public class Way2 implements TheWay{

    @Override
    public void printInfo(ArrayList<Student> students) {
        int sum1=0;
        int sum2=0;

        System.out.println("所有学生信息:");
        for (int i = 0; i < students.size() ; i++) {
            Student st =students.get(i);
            System.out.println("姓名"+st.getName()+",性别："+st.getSex()+"，成绩："+st.getScore());
       if (Objects.equals(st.getSex(), "男")){
          sum1++;
       }else sum2 ++;
        }
        System.out.println("男生："+sum1+"人，女生:"+sum2+"人");
    }

    @Override
    public void printAve(ArrayList<Student> students) {
        double ave =0;
        for (int i = 0; i < students.size(); i++) {
            ave+=students.get(i).getScore();
        }
        System.out.println("平均成绩："+(ave/students.size()));
    }
}
