package com.aditya.web;

import java.util.*;

public class MainApp {

    public static void main(String args[]) {
        MainApp mainApp = new MainApp();
        int sum = mainApp.getSum(5, 2);
        System.out.println("Sum = " + sum);
    }

    public int getSum(int a, int b) {
        return a + b;
    }
}
