package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.ArrayList;
import java.util.List;

@RunWith(Parameterized.class)
public class ValidEmailTest {
    String emailTest;
    boolean expectedResult;

    public ValidEmailTest(String email, boolean expectedResult) {
        this.emailTest = email;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters
    public static List inputEmail(){
        List list = new ArrayList();
        list.add(new Object[] {"shalu8mar@gmail.com",true});
        list.add(new Object[] {"shalu8mar@gmail.com",true});
       // list.add(new Object[] {"abc-100@yahoo.com",true});
        list.add(new Object[] {"abc@yahoo.com",true});
        list.add(new Object[] {"abc.100@yahoo.com",true});
        list.add(new Object[] {"abc111@abc.com",true});
       // list.add(new Object[] {"abc-100@abc.net",true});
        list.add(new Object[] {"abc.100@abc.com.au",true});
        list.add(new Object[] {"abc@1.com",true});
       // list.add(new Object[] {"abc+100@gmail.com",true});
        //* InValid Emails
        list.add(new Object[] {"abc",false});  //– must contains “@” symbol
        list.add(new Object[] {"abc@.com",false}); //my – tld can not start with dot “.”
        //list.add(new Object[] {"abc123@gmail.a",false}); // – “.a” is not a valid tld, last tld must contains at least two characters
        list.add(new Object[] {"abc123@.com ",false}); //– tld can not start with dot “.”
        list.add(new Object[] {"abc123@.com.com",false}); // – tld can not start with dot “.”
        list.add(new Object[] {".abc@abc.com",false});  //– email’s 1st character can not start with “.”
        list.add(new Object[] {"abc()*@gmail.com",false});  //– email’s is only allow character, digit, underscore and dash
        //list.add(new Object[] {"abc..2002@gmail.com",false}); //– double dots “.” are not allow
        list.add(new Object[] {"abc.@gmail.com ",false}); //– email’s last character can not end with dot “.”
        list.add(new Object[] {"abc@abc@gmail.com", false}); //– double “@” is not allow
        list.add(new Object[]{"abc@gmail.com.1a ",false}); //-email’s tld which has two characters can not contains digit

        return list;
    }
    @Test
    public void validateEmail() {
        ValidEmail validEmail = new ValidEmail();
        boolean result = validEmail.validateEmail(this.emailTest);
        Assert.assertEquals(this.expectedResult,result);
    }
}


