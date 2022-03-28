package com.userregistration;

import java.util.Scanner;

public class RegexTest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the FullName: ");
        String name = scan.nextLine();
        System.out.println(" Please Enter the Email");
        String email = scan.nextLine();
        System.out.println(" Enter the Mobile Number: ");
        String phoneNumber = scan.nextLine();

        UserRegistration user = new UserRegistration();
        user.firstName(name);
        user.email(email);
        user.phoneNumber(phoneNumber);
        scan.close();
    }
}
