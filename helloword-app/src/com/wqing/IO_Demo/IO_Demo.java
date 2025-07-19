package com.wqing.IO_Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO_Demo {
    public static void main(String[] args) throws IOException {
        File file =new File("H:/迅雷下载/javbt.net_CAWD-767C.mp4");
        FileInputStream fileInputStream=new FileInputStream(file);

//        while (fileInputStream.read() != -1){
//            System.out.println(fileInputStream.read());
//        }




        byte[] buffer=new byte[5];
        int len =fileInputStream.read(buffer);
        String rs=new String(buffer,0,len);
        System.out.println(rs);
        System.out.println(len);

        fileInputStream.close();
    }
}
