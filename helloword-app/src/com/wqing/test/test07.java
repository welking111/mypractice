package com.wqing.test;

import com.wqing.Bean.FoodManager;
import com.wqing.Bean.Movie;
import com.wqing.Bean.Student;
import com.wqing.Bean.StudentOperator;

import java.util.Arrays;

public class test07 {
    public static void main(String[] args) {
        Student st=new Student();
st.setScore(99.5);
st.setName("小明");
st.setAge(20);
st.setSex("男");

//无参数构造
StudentOperator stu=new StudentOperator();
stu.setStudent(st);
stu.show();
//无参数构造有参数构造
StudentOperator so=new StudentOperator(st);
so.show();

        Movie mv =new Movie(666,"末路狂花",48,8.5,"贾冰","贾冰","贾冰q全是\"贾冰\",");
        System.out.println(mv.toString());


        String strr=new String("sa45qwe");
        System.out.println(strr);
        System.out.println(strr.substring(1,5));
        String rs5 = "张无忌,周芷若,殷素素,赵敏,王二，卢本伟";
        String[] strs =rs5.split(",");
        System.out.println(Arrays.toString(strs));
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

FoodManager fm=new FoodManager();
fm.start();


    }



}
