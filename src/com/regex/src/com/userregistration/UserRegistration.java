package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    final String NAME = "^[A-Z][a-z]{2,}(\\s)?[A-Z][a-z]{2,}$";
    final String EMAIL = "^[a-zA-Z0-9+_-]+([.][a-zA-Z0-9+_-]+)*@[a-zA-Z0-9]+([.][a-zA-Z0-9+_-]+)+$";
    final String PHONE = "^[0-9]{1,3}[\\s][0-9]{10}$";

    public void firstName(String name) {

        Pattern pattern = Pattern.compile(NAME);
        Matcher match = pattern.matcher(name);
        System.out.println(match.matches());
    }

    public void email(String email) {

        Pattern pattern = Pattern.compile(EMAIL);
        Matcher match = pattern.matcher(email);
        System.out.println(match.matches());
    }

    public void phoneNumber(String phone) {
        Pattern pattern = Pattern.compile(phone);
        Matcher matcher = pattern.matcher(phone);
        System.out.println(matcher.matches());
    }
}