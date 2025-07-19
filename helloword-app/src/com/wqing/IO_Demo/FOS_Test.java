package com.wqing.IO_Demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FOS_Test {
    public static void main(String[] args) throws Exception {
        OutputStream os= new FileOutputStream("helloword-app/src/com/wqing/IO_Demo/我的测试文件.txt",true);

        os.write(99);
        os.write('A');
        byte[] buffer= "woshiyigeceshiwenjian".getBytes();
        os.write(buffer);

        os.write("\r\n".getBytes());
        os.write("呀哈哈".getBytes());
        os.close();
    }
}
