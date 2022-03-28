package com.advjava;

public class PinCode {

    static String pattern = "^([0-9]){6}";
    static String nameRegex = "441103";

    public static void main(String[] args) {
        System.out.println(nameRegex.matches(pattern));
    }

}
