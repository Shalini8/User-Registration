package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    private final String FIRST_NAME_PATTERN = "[A-Z]{1}[a-z]{2,10}";
    private final String LAST_NAME_PATTERN = "[A-Z]{1}[a-z]{2,10}";
    private final String Email_PATTERN ="^[a-zA-Z0-9]{1,}[.a-zA-Z0-9]*@[a-zA-Z0-9]{1,}.[a-z]{1,3}(.[a-z]{2})*$";
    private final String MobileNo_PATTERN="([0-9]{2})[ ]([0-9]{10})$";
    private final String Password_PATTERN= "^(?=.*\\d)([a-z])*(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        return result;
    }
    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();
        return result;
    }
    public boolean validateEmail(String Email) {
        Pattern pattern = Pattern.compile(Email_PATTERN);
        Matcher matcher = pattern.matcher(Email);
        boolean result = matcher.matches();
        return result;
    }
    public boolean validateMobileNo(String mobileno) {
        Pattern pattern = Pattern.compile(MobileNo_PATTERN);
        Matcher matcher = pattern.matcher(mobileno);
        boolean result = matcher.matches();
        return result;
    }
       public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(Password_PATTERN);
        Matcher matcher = pattern.matcher(password);
        boolean result = matcher.matches();
        return result;
    }


    }
