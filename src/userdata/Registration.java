package userdata;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Registration {
	static Scanner userInput = new Scanner(System.in);

	// * To Validate the Password :it should contain atleast 1 Numeric digit*
	public static void checkPattern1Password() { 
		String password =	"^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,20}";
		System.out.println("Enter the 8 digits Password should contain atleast 1 upperCase and numeric digit : ");
		String check = userInput.next();
		if (Pattern.matches(password, check))
			System.out.println("Valid password");
		else
			System.out.println("Invalid: please try again!!!");
	}
}
