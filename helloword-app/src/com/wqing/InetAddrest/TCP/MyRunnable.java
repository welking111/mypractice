package com.wqing.InetAddrest.TCP;

import com.wqing.InetAddrest.QQ_Demo.Server;

import java.io.*;
import java.net.Socket;

public class MyRunnable  implements Runnable{
        private  Socket socket;
    public MyRunnable(Socket socket) {
        this.socket=socket;
    }

    @Override
    public void run() {
        try {
            InputStream ip =socket.getInputStream();
            DataInputStream dis =new DataInputStream(ip);
            while (true){
                try {
                    String msg=dis.readUTF();
                    System.out.println(msg);
                    //把数据群发
                    senMegToAll(msg);
                } catch (Exception e) {
                    Server.sockets.remove(socket);
                    System.out.println("有人下线了："+socket.getRemoteSocketAddress());
                    dis.close();
                    ip.close();
                    socket.close();
                    break;
                }


            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private void senMegToAll(String msg) throws Exception {
        for (Socket socket1 : Server.sockets) {
            OutputStream os =socket1.getOutputStream();
            DataOutputStream dos =new DataOutputStream(os);
            dos.writeUTF(msg);
        }
    }
}
