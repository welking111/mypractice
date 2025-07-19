package com.wqing.File_Demo;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        File f1=new File("D:/wangqing");
        System.out.println(f1.exists());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.mkdirs());

        System.out.println(f1.getName());
        System.out.println(f1.lastModified());
        SimpleDateFormat fm=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(fm.format(f1.lastModified()));
        System.out.println(f1.exists());
        System.out.println(f1.delete());
        System.out.println("*********************************");
        System.out.println(f(5));
        System.out.println("*********************************");
        System.out.println(sum(100));
        System.out.println("*********************************");
        System.out.println(eat(1));
        System.out.println("***********************************");
        searchFile(new File("D:/"),"清");
    }
    public static int f(int n){
        if(n==1){
            return 1;
        }

        return f(n-1)*n;
    }



    //计算1-n的和 n>=1
    public static int sum(int n){
        if (n==1){
            return 1;
        }
        return sum(n-1)+n;
    }
    //猴子吃桃
    public static int eat(int n){
        if (n==10){
            return 1;
        }
        return 2*eat(n+1)+2;
    }

    /**
     * 去指定目录搜索某个文件
     */
    public static void searchFile(File dir,String name){

        //排除非法路径
        if (dir==null||!dir.exists()||dir.isFile()){
            System.out.println(dir.getAbsoluteFile()+"路径非法");
            return;
        }
        //获取一级对象
        File[] files=dir.listFiles();
        if(files != null){
            for (File f:files){
                //判断是否为文件

                if(f.isFile()){
                    //判断文件中是否包含关键词
                    if (f.getName().contains(name)){
                        System.out.println("找到包含关键词的文件");
                        System.out.println(f.getAbsoluteFile());

                    }
                }else //不是文件，遍历到的是一个文件夹
                {

                    searchFile(f.getAbsoluteFile(),name);}
            }
        }

    }
}
