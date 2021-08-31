package com.bridgelabz;

public class UserValidator{
    public static void main(String[] args){
        UserRegistrationTest userValidator = new UserRegistrationTest();
        userValidator.FirstNameCheck();
        userValidator.LastNameCheck();
        userValidator.EmailCheck();
        userValidator.PhoneNumberCheck();
        userValidator.PasswordCheck();

    }
}