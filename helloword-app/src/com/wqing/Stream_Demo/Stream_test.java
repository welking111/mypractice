package com.wqing.Stream_Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stream_test {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Collections.addAll(list,"test1","test2","test3","demo1","dem2","demo3");
        System.out.println(list);
        list.stream().filter(s->s.contains("2")).sorted()
                .forEach(s -> System.out.println(s));
    }
}
