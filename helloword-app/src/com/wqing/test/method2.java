package com.wqing.test;

import com.wqing.Bean.Student;

import java.util.ArrayList;

public class method2 implements infoManger {



    @Override
    public void printAllInfo(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println("姓名："+students.get(i).getName()+",性别:"+students.get(i).getSex());
        }
    }

    @Override
    public void printAllSeore(ArrayList<Student> students) {

        double ave = 0;
        for (int i = 0; i < students.size(); i++) {
           ave+=students.get(i).getScore();
        }
        ave/=students.size();
        System.out.println("班级平均分："+ ave);
    }
}
