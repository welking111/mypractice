package com.wqing.IO_Demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FR_Test {
    public static void main(String[] args) throws Exception {
        FileReader fr=new FileReader("helloword-app/src/com/wqing/IO_Demo/我的测试文件.txt");
        BufferedReader br=new BufferedReader(fr);

//
//        int len ;
//        while ((len= fr.read())!=-1){
//           System.out.print(len);
//     }

//
//        char[] buffer=new char[3];
//        while ((len=fr.read(buffer))!=-1){
//            System.out.print(buffer);
//        }
        String len;
        while ((len=br.readLine())!=null){
            System.out.println(len);
        }


        fr.close();
    }
}
