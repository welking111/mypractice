package com.wqing.Thread_Demo.Thread_pool;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    private  int sum;

    public MyCallable(int sum){
        this.sum=sum;
    }

    @Override
    public String call() throws Exception {
        int add=0;
        for (int i = 0; i <sum ; i++) {
            add+=i;
        }

        return "总数是"+sum;
    }



}
