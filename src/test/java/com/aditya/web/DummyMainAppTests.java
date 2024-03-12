package com.aditya.web;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DummyMainAppTests {

    @Test
    void testFeature() {
        Assertions.assertEquals(true, DummyMainApp.checkPalindrome("battab"));
        Assertions.assertEquals(false, DummyMainApp.checkPalindrome("buses"));
    }
}
