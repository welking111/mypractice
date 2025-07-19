package com.wqing.InetAddrest;

import java.net.*;
import java.util.Scanner;

public class Cilent {
    public static void main(String[] args) throws Exception {
        //创建对象
        DatagramSocket socket=new DatagramSocket(9081);
        DatagramSocket socket2=new DatagramSocket(9082);
        //创建数据包
        //把字符串转成字节数组 "我是要发送的数据".getBytes()
        byte[] bytes= "我是要发送的数据".getBytes();
        DatagramPacket datagramPacket=new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),9080);
        socket.send(datagramPacket);

        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("请说");
            String message=sc.nextLine();
            if ("exit".equals(message)){
                System.out.println("结束");
                break;
            }
            byte[] bytes1 =message.getBytes();
            DatagramPacket datagramPackets=new DatagramPacket(bytes1,bytes1.length, InetAddress.getLocalHost(),9080);
            socket.send(datagramPackets);
            socket2.send(datagramPackets);

        }


        System.out.println("数据发送完毕~");
        socket.close();
    }
}
