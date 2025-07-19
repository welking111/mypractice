package com.wqing.InetAddrest;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public static void main(String[] args) throws Exception {
        System.out.println("服务端启动");
        DatagramSocket socket=new DatagramSocket(9080);

        //创建数据包用于接收数据
        byte[] bytes=new byte[1024*64]; //64KB
        DatagramPacket datagramPacket=new DatagramPacket(bytes,bytes.length);


        while (true) {
            socket.receive(datagramPacket);
            //本次接收到多少长度
            int len =datagramPacket.getLength();

            System.out.println(new String(bytes,0,len));
            System.out.println(datagramPacket.getAddress().getHostAddress());
            System.out.println(datagramPacket.getSocketAddress());
        }


    }
}
