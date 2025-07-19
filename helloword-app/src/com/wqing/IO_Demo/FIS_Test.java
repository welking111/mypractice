package com.wqing.IO_Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FIS_Test {
    public static void main(String[] args) throws Exception {
        FileInputStream f1=new FileInputStream("helloword-app/src/com/wqing/IO_Demo/IO_Demo.java");




        byte[] buffer =new byte[300];
        int len;
        while ((len=f1.read(buffer))!=-1){
            System.out.print(new String(buffer,0,len));

        }

        File f=new File("helloword-app/src/com/wqing/IO_Demo/IO_Demo.java");
        long size=f.length();
        byte[] allbuff=new byte[(int) f.length()];

        byte[] buffers = f1.readAllBytes();
        System.out.print(new String(buffers));
        f1.close();

    }
}
