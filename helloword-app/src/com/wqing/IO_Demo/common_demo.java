package com.wqing.IO_Demo;

import org.apache.commons.io.FileUtils;

import javax.imageio.stream.FileImageOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class common_demo {
    public static void main(String[] args) throws Exception {
        File fr=new File("helloword-app/src/com/wqing/IO_Demo/我的测试文件.txt");

      String text=  FileUtils.readFileToString(fr,"gbk");
        System.out.println(text);
    }
}
