package userdata;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Registration {
	static Scanner userInput = new Scanner(System.in);
	
	//*To check the Format of EmailID*
	public static void checkEmailID() { // UC3
		System.out.println("Enter the valid EmailId: ");
		String check = userInput.next();
		String emailId = "^[a-zA-Z0-9]{1,}[.a-zA-Z0-9]*@[a-zA-Z0-9]{1,}.[a-z]{1,3}(.[a-z]{2})*$";
		if (Pattern.matches(emailId, check))
			System.out.println("Correct Format of email: ");
		else
			System.out.println("Invalid email  : please try again!!!");
	}

	
}
