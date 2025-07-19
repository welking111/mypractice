package com.wqing.Lambda_Demo;

import com.wqing.Bean.People;
import com.wqing.Bean.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntToDoubleFunction;

public class Test {
    public static void main(String[] args) {
        double[] prices={99.8,128,100,67,119};        System.out.println(Arrays.toString(prices));
        //       Arrays.setAll(prices, new IntToDoubleFunction() {
//            @Override
//            public double applyAsDouble(int value) {
//                return prices[value]*10;
//            }
//        });
        Arrays.setAll(prices,value->  prices[value]-10);
        System.out.println(Arrays.toString(prices));

        Student[] students =new Student[4];
        students[0]=new  Student("小明","nan",12,6);
        students[1]=new  Student("小明","nan",10,6);
        students[2]=new  Student("小明","nan",13,6);
        students[3]=new  Student("小明","nan",6,6);
        System.out.println(Arrays.toString(students));
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()- o2.getAge();
            }
        });
        System.out.println(Arrays.toString(students));
        Arrays.sort(students,(o1,o2)->{return o2.getAge()- o1.getAge();});
        //Arrays.sort(students,(o1,o2)-> o2.getAge()- o1.getAge());
        System.out.println(Arrays.toString(students));

        Arrays.sort(students,CompareByDate::compareBaAge);
        System.out.println(Arrays.toString(students));


    }

}