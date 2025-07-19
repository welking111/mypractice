package com.wqing.Stream_Demo;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        strings.stream().filter(a ->a.contains("a")).sorted().forEach(a -> System.out.println(a));

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> lists=numbers.stream().map(a->a*a).toList();
        System.out.println(lists);
        //List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbers.stream().mapToInt(x -> x).summaryStatistics();

        System.out.println("??????? : " + stats.getMax());
        System.out.println("??????? : " + stats.getMin());
        System.out.println("????? : " + stats.getSum());
        System.out.println("??? : " + stats.getAverage());
    }
}
