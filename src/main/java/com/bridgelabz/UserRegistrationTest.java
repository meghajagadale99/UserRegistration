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

}