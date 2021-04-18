package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmail {
    private final String Email_PATTERN ="^[a-zA-Z0-9]{1,}[.a-zA-Z0-9]*@[a-zA-Z0-9]{1,}.[a-z]{1,3}(.[a-z]{2})*$";

    public boolean validateEmail(String Email) {
        Pattern pattern = Pattern.compile(Email_PATTERN);
        Matcher matcher = pattern.matcher(Email);
        boolean result = matcher.matches();
        return result;
    }
}
