package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    final String FIRST_NAME = "^[A-Z][a-z]{2,}$";

    public void firstName(String name) {

        Pattern pattern = Pattern.compile(FIRST_NAME);
        Matcher match = pattern.matcher(name);
        System.out.println(match.matches());
    }
}