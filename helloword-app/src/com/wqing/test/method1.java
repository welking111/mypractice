package com.wqing.test;

import com.wqing.Bean.Student;

import java.util.ArrayList;

public class method1  implements infoManger {




    @Override
    public void printAllInfo(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }
    }

    @Override
    public void printAllSeore(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName()+students.get(i).getScore());
        }
    }
}
