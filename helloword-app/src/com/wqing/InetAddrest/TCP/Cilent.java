package com.wqing.InetAddrest.TCP;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Cilent {
    public static void main(String[] args) throws Exception {
        Socket cilent=new Socket(InetAddress.getLocalHost(),7654);

        OutputStream outputStream=cilent.getOutputStream();
        DataOutputStream dos=new DataOutputStream(outputStream);

        dos.writeUTF("在吗？可以听到吗？"+"\n"+LocalDateTime.now());

        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入要发送的内容：");
            String msg=sc.nextLine();
            if ("exit".equals(msg)){break;}
            dos.writeUTF(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss"))+"\n"+msg);
            dos.flush();

        }
        dos.close();
        cilent.close();

    }
}
