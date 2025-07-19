package com.wqing.Thread_Demo.Thread_communication;

import com.wqing.test.A;

import java.util.ArrayList;
import java.util.List;

public class Desk {
private List<String> list=new ArrayList<>();
    public synchronized void put() throws Exception {
        try {
            String name=Thread.currentThread().getName();
//判断是否有包子
            if(list.size()==0){
                list.add(name+"做的包子");
                System.out.println(name+"做了一个包子");call();
                Thread.sleep(2);
                this.notifyAll();
                this.wait();
            }else {//有包子就不做了
                System.out.println(name+"做了一个包子"); list.add(name+"做的包子");   //一直做
                call();
                this.notifyAll();
                this.wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public synchronized void eat() throws Exception {
        String name=Thread.currentThread().getName();
        if(list.size() >0){
            System.out.println(name+"吃了一个"+list.get(0)+"包子");
            Thread.sleep(2);
            list.remove(0);call();
            this.notifyAll();
            this.wait();
        }else {
            System.out.println("桌子上没有包子"+name+"没有吃到包子");call();
            this.notifyAll();
            this.wait();
        }
    }

    public  void  call(){
        System.out.println("桌上剩余包子数量："+list.size());
    }
}
