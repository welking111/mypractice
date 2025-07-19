package com.wqing.Map_Demo;

import java.util.HashMap;
import java.util.Map;

public class Map_iterator {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap();
        map.put(1,"values1");
        map.put(2,"values2");
        map.put(3,"values3");
        map.put(4,"values4");
        map.put(5,"values5");
        map.put(6,"values6");
        map.put(7,"values7");

        //way1
        System.out.println("way1");
        for(Integer i: map.keySet()){
            System.out.println(i+":"+map.get(i));
        }
        //way2
        System.out.println("way2");

        for (String values: map.values()){
            System.out.println(values);
        }
        //way3
        System.out.println("way3");
        for (Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        //way4
        System.out.println("way4");
        map.forEach((k,v)->{
            System.out.println(k+";"+v);
        });

    }
}
