package com.wqing.Bean;

public  class Mouse extends Animal {
    @Override
    public void cry() {
        System.out.println("老鼠吱吱吱");
    }

    public Mouse(String myName, int myid) {
        super(myName, myid);
    }


    @Override
    public void sleep(){
super.sleep();
        System.out.println("还喜欢大睡特睡");
    }
    public void steal(){
        System.out.println("耗子还会偷东西呢");
    }

    @Override
    public String toString() {
       return super.toString();

    }
}
