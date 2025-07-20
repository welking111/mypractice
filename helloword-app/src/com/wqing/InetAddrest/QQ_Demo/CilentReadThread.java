package com.wqing.InetAddrest.QQ_Demo;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class CilentReadThread  implements Runnable{

    private Socket socket;
    public CilentReadThread(Socket socket) {
        this.socket=socket;
    }


    @Override
    public void run() {
        try {
            InputStream is =socket.getInputStream();
            DataInputStream dis=new DataInputStream(is);
           while (true){
               try {
                   String msg =dis.readUTF();
                   System.out.println(msg);
               } catch (IOException e) {

                   throw new RuntimeException(e);
               }
           }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
