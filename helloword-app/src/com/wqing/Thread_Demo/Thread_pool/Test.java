package com.wqing.Thread_Demo.Thread_pool;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws Exception {
//        int corePoolSize,
//        int maximumPoolSize,
//        long keepAliveTime,
//        TimeUnit unit,
//        BlockingQueue<Runnable> workQueue,
//        ThreadFactory threadFactory,
//        RejectedExecutionHandler handler
        ThreadPoolExecutor pool=new ThreadPoolExecutor(3,5,8,TimeUnit.SECONDS,new LinkedBlockingDeque(4),Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        MyRunnable myRunnable=new MyRunnable();
        pool.execute(myRunnable);
        pool.execute(myRunnable);
        pool.execute(myRunnable);


        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("进入了临时线程："+Thread.currentThread().getName());
            }
        });

        /////////////////////////////

     Future<String> f1=  pool.submit(new MyCallable(100));
     Future<String> f2=  pool.submit(new MyCallable(1000));
        System.out.println(f1.get());
        System.out.println(f2.get());

        pool.shutdown();



   //
    ExecutorService p2= Executors.newFixedThreadPool(5);
    p2.execute(myRunnable);
    }
}
