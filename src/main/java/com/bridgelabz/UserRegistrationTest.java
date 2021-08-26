package com.bridgelabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationTest {
    String first_name;
    String last_name;
    String email;

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
    //verify lastName
    public void lastnameVerification(String last_name) {
        Pattern pattern_last_name = Pattern.compile("[A-Z][a-z]{2,}");
        this.last_name = last_name ;
        Matcher lastName_matcher = pattern_last_name.matcher(last_name);

        if(lastName_matcher.find() &&  lastName_matcher.group().equals(last_name))
            System.out.println("valid name");
        else
            System.out.println("Invalid name");
    }

}
