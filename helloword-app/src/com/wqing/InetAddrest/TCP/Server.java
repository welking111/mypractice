package com.wqing.InetAddrest.TCP;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket=new ServerSocket(7654);
        System.out.println("服务端启动成功~");


        while (true) {

            Socket socket= serverSocket.accept();

            System.out.println("有人上线了:"+socket.getRemoteSocketAddress());
            new Thread(new MyRunnable(socket)).start();





        }


    }
}
