package com.wqing.test;

import com.wqing.Bean.Student;

import java.util.ArrayList;

public class Way1  implements TheWay{

    @Override
    public void printInfo(ArrayList<Student> students) {
        System.out.println("所有学生信息:");
        for (int i = 0; i < students.size() ; i++) {
            Student st =students.get(i);
            System.out.println("姓名"+st.getName()+",性别："+st.getSex()+"，成绩："+st.getScore());
        }
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