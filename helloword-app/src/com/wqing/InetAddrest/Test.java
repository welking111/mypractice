package com.wqing.InetAddrest;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) throws Exception {
//        Student student=Student.GETSTUDENT();
//        System.out.println(student.getName());
        InetAddress inetAddress=InetAddress.getLocalHost();
        System.out.println(inetAddress.getHostName());
        System.out.println(inetAddress.getHostAddress());
        InetAddress ip2=InetAddress.getByName("www.baidu.com");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());


        System.out.println(ip2.isReachable(6000));



        InetAddress ip3=InetAddress.getByName("192.168.99.1");
        System.out.println(ip3.isReachable(5000));

    }
}
