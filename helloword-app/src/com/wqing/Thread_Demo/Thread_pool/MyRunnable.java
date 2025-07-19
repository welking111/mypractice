package com.wqing.Thread_Demo.Thread_pool;

public class MyRunnable  implements  Runnable{



    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
