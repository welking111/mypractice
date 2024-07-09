package com.wqing.Bean;

public class Student extends  People{
    private String name;//姓名
    private String sex;//性别
    private int age;
    private double score;//成绩


//实例代码块
{
    System.out.println("实例代码块被执行了");
    System.out.println("有人创建了对象"+this);
}
    public Student(){
        System.out.println("无参数构造器被执行");
    }
    public Student(String name){
        System.out.println("有参数构造器被执行");

    }

    public Student(String name, String sex, double score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }


}
