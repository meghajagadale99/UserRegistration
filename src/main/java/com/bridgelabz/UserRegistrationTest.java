package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class UserRegistrationTest {

    final String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$";
    final String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
    final String emailIdPattern = "^[a-zA-Z0-9]{1,}[.a-zA-Z0-9]*@[a-zA-Z0-9]{1,}((.){1}+)([a-z]{1,3}+)(.[a-z]{2})*$";
    final String phoneNumberPattern = "[0-9]{2}[\\s][0-9]{10}$";
    final String passwordPattern = "^(?=.*\\d)([a-z])*(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";

    public void checkPatternFirstName() {

        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println("enter the First Name: ");
            String checkPattern = userInput.nextLine();

            if (Pattern.matches(firstNamePattern, checkPattern))
                System.out.println("Pattern match. Correct Input.");
            else
                throw new UserDefineException("Please Follow the pattern And Enter a valid Frist name");
            System.out.println("First name:- " + checkPattern);
        }

        catch (UserDefineException e) {
            System.out.println(e.errorMessage);
            checkPatternFirstName();
        }
    }
    public void checkPatternLastName() {

        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println("enter the Last Name: ");
            String checkPattern = userInput.next();

            if (Pattern.matches(lastNamePattern, checkPattern))
                System.out.println("Pattern match.");
            else
                throw new UserDefineException("Please follow the pattern and enter a valid LastName");
            System.out.println("Last name:- " + checkPattern);
        }
        catch (UserDefineException e) {
            System.out.println(e.errorMessage);
            checkPatternLastName();
        }
    }
    public void checkPatternEmailId() {

        ArrayList<String> emails = new ArrayList<String>();
        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");
        emails.add("abc@gmail.com");
        emails.add("abc@gmail.com.com");
        emails.add("abc+100@gmail.com");

        emails.add("abc");
        emails.add("abc@.com.my");
        emails.add("abc123@gmail.a");
        emails.add("abc123@.com");
        emails.add("abc123@.com.com");
        emails.add(".abc@abc.com");
        emails.add("abc()*@gmail.com");
        emails.add("abc@%*.com");
        emails.add("abc..2002@gmail.com");
        emails.add("abc.@gmail.com");
        emails.add("abc@abc@gmail.com");
        emails.add("abc@gmail.com.1a");
        emails.add("abc@gmail.com.aa.au");

        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println("enter the Email address: ");
            String checkPattern = userInput.next();

            if (Pattern.matches(emailIdPattern, checkPattern))
                System.out.println("Pattern match.");
            else
                throw new UserDefineException("Please follow the pattern and enter a valid Email");
            System.out.println("Email:- " + checkPattern);
        }
        catch (UserDefineException e) {
            System.out.println(e.errorMessage);
            checkPatternEmailId();
        }
    }
    public void checkPatternPhoneNumber() {

        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println("enter the PhoneNo: ");
            String checkPattern = userInput.nextLine();

            if (Pattern.matches(phoneNumberPattern, checkPattern))
                System.out.println("Pattern match.");
            else
                throw new UserDefineException("Please follow the pattern and enter a valid PhoneNumber");
            System.out.println("Phone Number:- " + checkPattern);
        }
        catch (UserDefineException e) {
            System.out.println(e.errorMessage);
            checkPatternPhoneNumber();
        }
    }
    public void checkPatternPassword() {

        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println("enter the Password: ");
            String checkPattern = userInput.next();

            if (Pattern.matches(passwordPattern, checkPattern))
                System.out.println("Pattern match.");
            else
                throw new UserDefineException("Please follow the pattern and enter a valid Password");
            System.out.println("Password:- " + checkPattern);
        }
        catch (UserDefineException e) {
            System.out.println(e.errorMessage);
            checkPatternPassword();
        }
    }
}