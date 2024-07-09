package com.wqing.test;

import com.wqing.Bean.Mouse;
import com.wqing.Bean.Student;

import java.util.ArrayList;

public class JiChengTest {


    public static void main(String[] args) {
        Mouse ms=new Mouse("mike",123);
        ms.eat();
    ms.sleep();
    ms.steal();

    ms.printInfo();

        System.out.println(ms.toString());


        //ArrayList 重写 tostring
        ArrayList lists =new ArrayList();
        lists.add("waoa");
        lists.add("哇哦");
        System.out.println(lists);

        System.out.println(A.ADemo);


        A abt=new ABTest();
        abt.down();





    }
}
