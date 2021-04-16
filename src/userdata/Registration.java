package userdata;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Registration {
	static Scanner userInput = new Scanner(System.in);

	// * To Validate the Password :it should contain atleast1 UpperCase 1 Numeric
	// digit,1 special character*
	public static void checkPattern2Password() {
		String password = "^(?=.*\\d)([a-z])*(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";
		System.out.println("Enter the minimum 8 digits Password should contain atleast 1 upperCase and numeric digit and 1 Special character : ");
		String check = userInput.next();
		if (Pattern.matches(password, check))
			System.out.println("Valid password");
		else
			System.out.println("Error !!! please check your Format");
	}
}
