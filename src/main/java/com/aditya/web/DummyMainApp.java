package com.aditya.web;

import io.micrometer.common.util.StringUtils;

public class DummyMainApp {

    public static void main(String args[]){

        String input = "dad";
        System.out.println(input + " : "+ checkPalindrome(input));
        input = "buses";
        System.out.println(input + " : "+ checkPalindrome(input));

    }

    public static boolean checkPalindrome(String s){
        Boolean result = false;
        StringBuilder ss = new StringBuilder(s);
        if(!ss.isEmpty()){
            if(ss.reverse().toString().equals(s)){
                return true;
            }
        }
        return result;
    }
}
