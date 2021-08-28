package com.bridgelabz;

public class UserValidator {
    public static void main(String[] args) {
        System.out.println("Welcome to user registration file.");

        UserRegistrationTest firstName = new UserRegistrationTest();
        UserRegistrationTest lastName = new UserRegistrationTest();
        UserRegistrationTest emailId = new UserRegistrationTest();
        UserRegistrationTest phoneNumber = new UserRegistrationTest();
        UserRegistrationTest password = new UserRegistrationTest();

        firstName.checkPatternFirstName();
        lastName.checkPatternLastName();
        emailId.checkPatternEmailId();
        phoneNumber.checkPatternPhoneNumber();
        password.checkPatternPassword();
    }
}