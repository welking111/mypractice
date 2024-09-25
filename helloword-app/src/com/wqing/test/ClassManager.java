package com.wqing.test;

import com.wqing.Bean.Student;

import java.util.ArrayList;

public class ClassManager {
    private ArrayList<Student> students =new ArrayList<>();
TheWay tw = new Way2();


    public ClassManager(){
        students.add(new Student("麦克","男",87));
        students.add(new Student("杰克","男",98));
        students.add(new Student("塞文","男",77));
        students.add(new Student("小乔","女",92));
        students.add(new Student("莎弥拉","女",66));
    }




    public  void printInfo(){
        tw.printInfo(students);
    }
    public  void  printAve(){
tw.printAve(students);
    }
}
