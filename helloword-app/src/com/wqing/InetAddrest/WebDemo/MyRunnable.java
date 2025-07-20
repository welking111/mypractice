package com.wqing.InetAddrest.WebDemo;

import jdk.net.Sockets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class MyRunnable implements Runnable {
    private Socket socket;
    public MyRunnable(Socket socket){
        this.socket=socket;
    }

    @Override
    public void run() {
        try {
            PrintStream ps =new PrintStream(socket.getOutputStream());
            while (true) {
                ps.println("HTTP/1.1 200 OK");
                ps.println("Content-Type:text/html;charset=UTF-8");
                ps.println(); // 必须换行
                ps.println("<div style='color:red;font-size:120px;text-align:center'>2025.7.20 666<div>");
                ps.println("666666");
            }




        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
