package com.wqing.Bean;

public class StudentOperator {
    private  Student student;
    public StudentOperator(){}
    public StudentOperator(Student s){
        this.student=s;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public  void show(){
        System.out.println("学生姓名："+student.getName());
        System.out.println("学生年龄："+student.getAge());
        System.out.println("学生性别："+student.getSex());
        System.out.println("学生分数："+student.getScore());
    }
}
