package com.wqing.Log_Demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    public static final Logger LOGGER= LoggerFactory.getLogger("logbacktest");

    public static void main(String[] args) {
        LOGGER.info("mian方法开始");
        LOGGER.error("fail");
        System.out.println("test");
    }
}
