package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

    public class UserValidationTest {
        // Its a Happy case!!!
        //@testValidationFirstName returns true ie given input is correct way to enter First name.
        @Test
        public void testValidationFirstName() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateFirstName("Abc");
            Assert.assertEquals(true, result);
        }
        // Its a Sad  case!!!
        //@testInValidFirstName returns false ie given input is not correct way to enter First name.
        // It should have first letter as Capital.
        @Test
        public void testInValidFirstName() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateFirstName("abc");
            Assert.assertEquals(false, result);
        }
        // Its a Sad  case!!!
        //@testInValidFirstName returns false ie given input is not correct way to enter First name.
        // It should have first letter as Capital and should be of minimum 3 letters
        @Test
        public void testShortFirstName() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateFirstName("ab");
            Assert.assertEquals(false, result);
        }
        // Its a Happy case!!!
        //@testValidationLastName returns true ie given input is correct way to enter Last name.
        @Test
        public void testValidationLastName() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateLastName("Abc");
            Assert.assertEquals(true, result);
        }
        // Its a Sad  case!!!
        //@testInValidLastName returns false ie given input is not correct way to enter Last name.
        // It should have first letter as Capital.
        @Test
        public void testInValidLastName() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateLastName("abc");
            Assert.assertEquals(false, result);
        }
        // Its a Sad  case!!!
        //@testInValidFirstName returns false ie given input is not correct way to enter First name.
        // It should have first letter as Capital and should be of minimum 3 letters
        @Test
        public void testShortLastName() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateLastName("ab");
            Assert.assertEquals(false, result);
        }
        // Its a Happy case!!!
        @Test
        public void validateEmail_whileCorrect_returnTrue() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateEmail("shal8@gmail.com");
            Assert.assertEquals(true,result);
        }
        // Its a Sad  case!!!

        @Test
        public void invalidEmail_shouldReturn_false () {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateEmail("sha@gmail.com.com.com");
            Assert.assertEquals(false,result);
        }
        // Its a Sad  case!!!
        @Test
        public void invalidEmailCheck_shouldReturn_false() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateEmail("sha.gmail.com");
            Assert.assertEquals(false,result);
        }
        // Its a Happy case!!!
        @Test
        public void validateMobileNo_whileCorrect_return_true() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateMobileNo("91 9131486983");
            Assert.assertEquals(true,result);
        }
        // Its a Sad  case!!!
        @Test
        public void invalidMobileNo_returns_false() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateMobileNo("91 123456");
            Assert.assertEquals(false,result);
        }
        // Its a Sad  case!!!
        @Test
        public void invalidMobileNoCheck_returns_false() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validateEmail("123456789000");
            Assert.assertEquals(false,result);
        }
        // Its a Happy case!!!
        @Test
        public void validatePassword_returns_true() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validatePassword("Shalu8mar@");
            Assert.assertEquals(true,result);
        }
        // Its a Sad  case!!!
        @Test
        public void invalidPassword_returns_false() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validatePassword("Shalini8");
            Assert.assertEquals(false,result);
        }
        // Its a Sad  case!!!
        @Test
        public void invalidPasswordCheck_returns_false() {
            UserValidator userValidator = new UserValidator();
            boolean result = userValidator.validatePassword("aman26@");
            Assert.assertEquals(false,result);
        }
    }






