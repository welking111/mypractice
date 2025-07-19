package com.wqing.test;

import java.util.*;

public class Collections_Demo {
    public static void main(String[] args) {
        List alist =new ArrayList();
        alist.add("王麻子");
        alist.add("小李子");
        alist.add("李爱华");
        alist.add("张狗蛋");
        alist.add("小李");
        alist.add("李玉刚");
        System.out.println(alist);

//        Iterator<String> iterator=alist.iterator();
//        while (iterator.hasNext()){
//            String name =iterator.next();
//            if (name.contains("李")){
//                iterator.remove();
//               // alist.remove(name);
//
//            }
//        }
        for (int i = 0; i <alist.size() ; i++) {
            String name = (String) alist.get(i);
            if (name.contains("李")){
                alist.remove(name);
                i --;   //删除元素后使游标往左边移动1
            }
        }
        System.out.println(alist);
        //////////////////////////////////////////////////////////////////
        LinkedList list =new LinkedList<>();


        list.addFirst("test1");
        list.push("test2");
        list.push("test3");

        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list.getFirst());
        System.out.println(list);
        //////////////////////////////////////////////////////////////////
        Collections.addAll(alist,list);
        System.out.println("===========================");
        System.out.println(alist);        System.out.println("===========================");

        //////////////////////////////////////////////////////////////////

        HashMap<Integer,String> map =new HashMap();
        map.put(1,"test1");
        map.put(2,"test2");
        map.put(3,"test3");
        map.put(4,"test4");
        System.out.println(map);
        System.out.println(map.values());

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());

        }





    }
}
