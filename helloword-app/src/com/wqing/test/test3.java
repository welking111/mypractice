package com.wqing.test;


import java.util.Random;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {


            for (int j = 1; j <= i; j++) {
                System.out.print(i + "×" + j + "=" + j * i + "\t");
            }
            System.out.println();
        }

        int sum=0;
        for (int i = 0; i <= 100; i++) {
            if (i%2 == 1 ){
            sum+=i;}
        }
        System.out.print(sum);


// 需求：打印5行Hello World
        int i = 0;
        while (i < 50000) {
            // i = 0 1 2 3 4
            System.out.println("Hello World");
i++;
        }


       // 需求：世界最高山峰珠穆朗玛峰高度是：8848.86米=8848860毫米，假如我有一张足够大的它的厚度是0.1毫米。请问：该纸张折叠多少次，可以折成珠穆朗玛峰的高度？
        int chance=0;
        double weight =0.1;
        while (weight<8848860){
            weight*=2;
            chance++;
        }
        System.out.println("好了，现在一共折了 "+chance+"下;现在的纸张厚度是"+weight+"毫米");
        // 1、定义变量记住珠穆朗玛峰的高度和纸张的高度。
        double peakHeight = 8848860;
        double paperThickness = 0.1;

// 3、定义一个变量count用于记住纸张折叠了多少次
        int count = 0;

// 2、定义while循环控制纸张开始折叠
        while (paperThickness < peakHeight) {
            // 把纸张进行折叠，把纸张的厚度变成原来的2倍。
            paperThickness = paperThickness * 2;
            count++;
        }
        System.out.println("需要折叠多少次：" + count);
        System.out.println("最终纸张的厚度是：" + paperThickness);
        //需求：在控制台使用 * 打印出4行5列的矩形
        for (int j = 0; j <4 ; j++) {
            for (int k = 0; k<5 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
// 1、break:跳出并结束当前所在循环的执行。
// 场景：假如你又有老婆了，你犯错了，你老婆罚你说：5句我爱你
// 说到第三句的时候心软了，让你别再说了。
        for (int j = 1; j <5 ; j++) {
            if (j == 3){break;}
            System.out.println("我爱你");
        }
// 2、continue:跳出当前循环的当次执行，直接进入循环的下一次执行。
// 场景: 假如你有老婆，你犯错了，你老婆罚你洗碗5天。
// 第三天的时候，你表现很好，第三天不用洗碗，但是不解恨，第四天还是要继续的。
        for (int j = 1; j <=5 ; j++) {
            if (j == 3 ){
                System.out.println("今天表现好，可以不用洗碗");continue;}
            System.out.println("洗碗的第"+j+"天");
        }
//随机数
 //随机生成一个1-100之间的数据，提示用户猜测，猜大提示过大，猜小提示过小，直到猜中	  结束游戏
        Random  r=new Random();
        int SUIJISHU =r.nextInt(100);
        System.out.println("答案是"+SUIJISHU);
        Scanner sc =new Scanner(System.in);
        while(true) {
            System.out.println("猜数字开始，输入一个数字");
            int MyTest=sc.nextInt();
            if (MyTest> SUIJISHU) {
                System.out.println("猜大了！");

            } else if (MyTest< SUIJISHU) {
                System.out.println("猜小了！");

            } else if (MyTest == SUIJISHU) {
                System.out.println("猜对了！！！")
                ;
                break;
            }
            ;

        }
    }
}
