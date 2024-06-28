package com.wqing.Bean;

public class Mouse extends Animal {
    private String name;
    public Mouse(String myName, int myid) {
        super(myName, myid);
        this.name=myName;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
