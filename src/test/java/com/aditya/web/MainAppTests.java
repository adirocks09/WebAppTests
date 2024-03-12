package com.aditya.web;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MainAppTests {

    @Test
    void testDevelopedFeaure(){
        Assertions.assertEquals(10,MainApp.getSum(4,6));
        Assertions.assertNotEquals(9,MainApp.getSum(4,3));
    }
}
