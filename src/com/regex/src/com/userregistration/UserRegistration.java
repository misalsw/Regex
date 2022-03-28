package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    final String NAME = "^[A-Z][a-z]{2,}(\\s)?[A-Z][a-z]{2,}$";

    public void firstName(String name) {

        Pattern pattern = Pattern.compile(NAME);
        Matcher match = pattern.matcher(name);
        System.out.println(match.matches());
    }
}