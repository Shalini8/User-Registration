package userdata;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Registration {
	static Scanner userInput = new Scanner(System.in);

	// * To Validate the Password :it should contain atleast 1 upperCase*
	public static void checkPatternPassword() { 
		String password = "^(\\d[a-z])*(?=.*[A-Z]).{8,}$";
		System.out.println("Enter the 8 digits Password should contain atleast 1 UpperCase : ");
		String check = userInput.next();
		if (Pattern.matches(password, check))
			System.out.println("Valid Password : you may proceed further");
		else
			System.out.println("Invalid: please try again!!!");
	}
}
