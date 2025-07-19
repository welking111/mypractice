package com.wqing.IO_Demo;

import java.io.*;

public class FW_Test {

    public static void main(String[] args) throws IOException {
        Writer fw=new FileWriter("helloword-app/src/com/wqing/IO_Demo/我的测试文件.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);
        fw.write(98);
        fw.write("我上早8");

        fw.write("\r\n");



        bw.newLine();
        bw.write("newluine");











        OutputStream outputStream=new FileOutputStream("helloword-app/src/com/wqing/IO_Demo/我的测试文件.txt");
        Writer  writer=new OutputStreamWriter(outputStream,"GBK");
        BufferedWriter bw2 =new BufferedWriter(writer);
        bw2.write("我猜猜");


        bw2.close();

        bw.close();
        fw.close();
    }
}
