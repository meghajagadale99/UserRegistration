package com.bridgelabz;

import java.util.Scanner;

public class UserValidator {
    public static void main(String[] args) {
        UserRegistrationTest nameObj = new UserRegistrationTest();

        System.out.println("Enter a First Name:");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        nameObj.firstnameVerification(firstName);

    }
}
