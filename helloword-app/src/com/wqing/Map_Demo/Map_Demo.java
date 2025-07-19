package com.wqing.Map_Demo;

import java.util.*;

public class Map_Demo {
    public static void main(String[] args) {
        String[] selects ={"A","B","C","D"};
        List<String> lists= new ArrayList<>();
        Random r =new Random();
        for (int i = 0; i < 80; i++) {
            int index=r.nextInt(4);
            lists.add(selects[index]);
        }
        System.out.println(lists);

        Map<String,Integer> result=new HashMap<>();
        for (String str:lists){
            if (result.containsKey(str)){
                result.put(str,result.get(str)+1);
            } else result.put(str,1);
        }

        System.out.println(result);


        Map<String,HashSet<String>> map =new HashMap<>();
        HashSet<String> hashSet=new HashSet<>();



    }





}
