package com.wqing.Until;

public class TestDemo {
static {
    System.out.println("被执行了");
}

    public static void main(String[] args) {
        int[] kong = null;
        int[] arr1 = {};
        //用方法获取指定长度的数组
        int[] shuzu = ArraysUntils.getArrays(5);

        //用方法输出数组
        System.out.println(ArraysUntils.toString(kong));
        System.out.println(ArraysUntils.toString(arr1));
        System.out.println(ArraysUntils.toString(shuzu));
ArraysUntils.sortArrays(shuzu);
        System.out.println(ArraysUntils.toString(shuzu));

    }


}
