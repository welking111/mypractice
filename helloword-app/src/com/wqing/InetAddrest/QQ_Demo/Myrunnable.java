package com.wqing.InetAddrest.QQ_Demo;


import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Myrunnable  implements Runnable{
private Socket socket;
public Myrunnable(Socket socket){
    this.socket=socket;
}
    @Override
    public void run() {
        try {
            InputStream is =socket.getInputStream();
            DataInputStream dis =new DataInputStream(is);
            System.out.println(dis.readUTF());
        } catch (IOException e) {
            System.out.println("有客户端下线了: "+socket.getRemoteSocketAddress());
            throw new RuntimeException(e);
        }

    }
}
