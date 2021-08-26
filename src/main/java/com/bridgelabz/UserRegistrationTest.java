package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationTest {
    String first_name;

    //Verify firstname
    public void firstnameVerification(String first_name) {
        Pattern pattern_first_name = Pattern.compile("[A-Z][a-z]{2,}");
        this.first_name = first_name ;
        Matcher firstName_matcher = pattern_first_name.matcher(first_name);

        if( firstName_matcher.find() &&  firstName_matcher.group().equals(first_name))
            System.out.println("valid name");
        else
            System.out.println("Invalid name");
    }
}
