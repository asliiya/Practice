package com.cbt.utilities;

public class StringUtility {

    public static void main(String[] args) {

       String expected = null;
       String actual = null;
       verifyEquals(expected, actual);

    }

    public static void verifyEquals(String expected, String actual){

        if (expected.equals(actual)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

    }
}
