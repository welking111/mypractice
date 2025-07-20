package com.wqing.Junit_Demo;

import org.junit.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

public class StingUntilTest {
    @Test
    public void testprintNumber(){
        StingUntil.printNumber("test");
        StingUntil.printNumber(null);
    }

}
