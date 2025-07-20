package com.wqing.InetAddrest.WebDemo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket=new ServerSocket(4399);
        System.out.println("服务器启动成功");
        //建立线程池
        ExecutorService pool= Executors.newFixedThreadPool(5);

        while (true){
            Socket socket=serverSocket.accept();
            System.out.println("有人上线了:"+socket.getRemoteSocketAddress());
           // new Thread(new MyRunnable(socket)).start();
            pool.execute(new MyRunnable(socket));
        }
    }
}
