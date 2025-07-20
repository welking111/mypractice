package com.wqing.InetAddrest.QQ_Demo;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SecureCacheResponse;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cilent {
    public static void main(String[] args) throws Exception {
        Socket socket=new Socket(InetAddress.getLocalHost(),4399);

        new Thread(new CilentReadThread(socket)).start();

        OutputStream os=socket.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);

        Scanner sc =new Scanner((System.in));
        while (true){
            System.out.println("请输入信息：");
            String msg =sc.nextLine();
            if ("exit".equals(msg)){break;}
            dos.writeUTF(msg);
            dos.flush();
        }

        dos.close();
        os.close();
        socket.close();
    }
}
