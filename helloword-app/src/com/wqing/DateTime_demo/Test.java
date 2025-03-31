package com.wqing.DateTime_demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt.plusDays(10).minusMonths(1).minusMonths(-1).plusDays(-10));
        LocalDateTime dt2=LocalDateTime.of(2020,4,25,12, 0,12);
        System.out.println(dt2);

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dtf.format(dt));
        System.out.println(dtf.format(dt2));

        LocalDateTime dt3=LocalDateTime.parse("2025-02-02 18:00:01",dtf);
        System.out.println(dt3);

        LocalDateTime dt4=LocalDateTime.parse("2025-02-02T18:00:01");
        System.out.println(dt4);

    }

}
