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
}