package com.wqing.Thread_Demo.Thread_communication;

public class Test {
    public static void main(String[] args) {
        Desk   desk =new Desk();

        new Thread(()->{while (true){
            try {
                desk.put();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }},"厨师1").start();
        new Thread(()->{while (true){
            try {
                desk.put();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }},"厨师3").start();
        new Thread(()->{while (true){
            try {
                desk.put();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }},"厨师3").start();
        new Thread(()->{while (true){
            try {
                desk.eat();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }},"吃货1").start();
        new Thread(()->{while (true){
            try {
                desk.eat();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }},"吃货2").start();


    }
}
