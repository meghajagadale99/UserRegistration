package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;


public class UserRegistrationTest {

    public void checkPatternFirstName() {
        String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter the First Name: ");
        String checkPattern = userInput.next();

        if (Pattern.matches(firstNamePattern, checkPattern))
            System.out.println("Pattern match. Correct Input.");
        else
            System.out.println("pattern match fail!\nFirst name starts with Cap and has minimum 3 characters");
    }
    public void checkPatternLastName() {
        String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter the Last Name: ");
        String checkPattern = userInput.next();

        if (Pattern.matches(lastNamePattern, checkPattern))
            System.out.println("Pattern match.");
        else
            System.out.println("pattern match fail! \nLast name starts with Cap and has minimum 3 characters");
    }
    public void checkPatternEmailId() {
        String emailIdPattern = "^[a-zA-Z0-9]{1,}[.a-zA-Z0-9]*@[a-zA-Z0-9]{1,}((.){1}+)([a-z]{1,3}+)(.[a-z]{2})*$";
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter the Email address: ");
        String checkPattern = userInput.next();

        if (Pattern.matches(emailIdPattern, checkPattern))
            System.out.println("Pattern match.");
        else
            System.out.println("pattern match fail!Email has 3 mandatory parts abc, bl, & co and 2 optional (xyz & in) with	precise @ and . positions");
    }
    public void checkPatternPhoneNumber() {
        String phoneNumberPattern = "[0-9]{2}[\\s][0-9]{10}$";
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter the PhoneNo: ");
        String checkPattern = userInput.nextLine();

        if (Pattern.matches(phoneNumberPattern, checkPattern))
            System.out.println("Pattern match.");
        else
            System.out.println("pattern match fail!\nCountry code follow by space and 10 digit number");
    }
    public void checkPatternPassword() {
        String passwordPattern = "^(?=.*\\d)([a-z])*(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter the Password: ");
        String checkPattern = userInput.next();

        if (Pattern.matches(passwordPattern, checkPattern))
            System.out.println("Pattern match.");
        else
            System.out.println("pattern match fail! \nplease follow the pattern for right password");
    }
}