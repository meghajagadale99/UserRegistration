package com.bridgelabz;

import java.util.Scanner;

public class UserValidator {
    public static void main(String[] args) {
        UserRegistrationTest nameObj = new UserRegistrationTest();

        System.out.println("Enter a First Name:");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        nameObj.firstnameVerification(firstName);

        System.out.println("Enter a Last Name:");
        Scanner sc1 = new Scanner(System.in);
        String lastName = sc1.next();
        nameObj.lastnameVerification(lastName);

        System.out.println("Enter a Email:");
        Scanner sc3 = new Scanner(System.in);
        String email = sc3.next();
        nameObj.emailVerify(email);

        System.out.println("Enter Mobile Number:");
        Scanner sc4 = new Scanner(System.in);
        String mo_number = sc4.next();
        nameObj.mobileFormat(mo_number);

    }
}
