package com.wqing.Suanfa_Demo;

public class Regex_Demo {
    public static void main(String[] args) {
        System.out.println(checkQQ(null));
        System.out.println(checkQQ("1234567"));
        System.out.println(checkQQ("123456712345671234567"));
        System.out.println(checkQQ("12345a67"));
        System.out.println(checkQQ2("123456"));


        System.out.println("\\");
        System.out.println("9".matches("\\d"));
    }


    public static boolean checkQQ(String qq){
        if (qq == null||qq.startsWith("0")||qq.length()<6||qq.length()>20) {
            return  false;
        }
        for (int i = 0; i < qq.length(); i++) {
            char ch=qq.charAt(i);
            if ( ch<'0'||ch>'9') {
return false;
            }
        }

        return true;
    }
    public  static  boolean checkQQ2(String qq){

        return  qq!=null&&qq.matches("[1-9]\\d{5,19}");
    }
}
