package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationTest {
    String first_name;
    String last_name;
    String email;
    String mo_number;
    String password;

    //Verify firstname
    public void firstnameVerification(String first_name) {
        Pattern pattern_first_name = Pattern.compile("[A-Z][a-z]{2,}");
        this.first_name = first_name;
        Matcher firstName_matcher = pattern_first_name.matcher(first_name);

        if (firstName_matcher.find() && firstName_matcher.group().equals(first_name))
            System.out.println("valid name");
        else
            System.out.println("Invalid name");
    }

    //verify lastName
    public void lastnameVerification(String last_name) {
        Pattern pattern_last_name = Pattern.compile("[A-Z][a-z]{2,}");
        this.last_name = last_name;
        Matcher lastName_matcher = pattern_last_name.matcher(last_name);

        if (lastName_matcher.find() && lastName_matcher.group().equals(last_name))
            System.out.println("valid name");
        else
            System.out.println("Invalid name");
    }

    //verify email
    public void emailVerify(String email) {
        Pattern pattern_email = Pattern.compile("[A-Za-z0-9]{1,}[.][A-Za-z0-9]{1,}@[A-Z,a-z]{1,}[.]com[.]in");
        this.email = email;
        Matcher email_matcher = pattern_email.matcher(email);

        if (email_matcher.find() && email_matcher.group().equals(email))
            System.out.println("valid Email");
        else
            System.out.println("Invalid Email");
    }

    //mobile number
    public void mobileFormat(String mo_number) {
        Pattern pattern_mo_number = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        this.mo_number = mo_number;
        Matcher mo_number_matcher = pattern_mo_number.matcher(mo_number);

        if (mo_number_matcher.find() && mo_number_matcher.group().equals(mo_number))
            System.out.println("valid Mobile Number");
        else
            System.out.println("Invalid Mobile Number");
    }
    //check password has at least one upperCase and one numeric value
    public void passwordVerify(String password) {
        Pattern pattern_password = Pattern.compile("^(?=.{8,}$)([a-z]*)(?=.*?[A-Z])(?=.*?[0-9]).*$");
        this.password = password;
        Matcher password_matcher = pattern_password.matcher(password);

        if(password_matcher.find() &&  password_matcher.group().equals(password))
            System.out.println("valid password");
        else
            System.out.println("Invalid password");

    }

}
