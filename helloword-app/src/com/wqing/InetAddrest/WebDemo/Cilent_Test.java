package com.wqing.InetAddrest.WebDemo;

import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cilent_Test {
    public static void main(String[] args) throws Exception {
        Socket socket=new Socket(InetAddress.getLocalHost(),4399);
        DataOutputStream  dos=new DataOutputStream(socket.getOutputStream());

        Scanner sc =new Scanner(System.in);
        while (true){
            System.out.println("请输入：");
            String msg =sc.nextLine();
            dos.writeUTF(msg);
            dos.flush();
        }

    }
}
