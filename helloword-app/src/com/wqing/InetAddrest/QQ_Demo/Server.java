package com.wqing.InetAddrest.QQ_Demo;

import com.wqing.InetAddrest.TCP.MyRunnable;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    public static List<Socket> sockets=new ArrayList<>();
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket=new ServerSocket(4399);
        System.out.println("服务端启动成功！");

        while (true){
            Socket socket =serverSocket.accept();
            sockets.add(socket);
            System.out.println("有客户端上线了:"+socket.getRemoteSocketAddress());
            new Thread(new MyRunnable(socket)).start();

        }

    }
}
