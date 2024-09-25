package com.wqing.test;

import com.wqing.Bean.User;
import com.wqing.Until.YzmUntils;

public class StaticTest {
    public static void main(String[] args) {
       User u1= new User();
       User u2= new User();
       User u3 = new User("王二");

        System.out.println(u1.name);
        System.out.println(u2.name);
        u2.name="小明";
        System.out.println(u2.name);
        System.out.println(u3.name);
        System.out.println(User.number);
        System.out.println(YzmUntils.getYzm(5));
    }
}
