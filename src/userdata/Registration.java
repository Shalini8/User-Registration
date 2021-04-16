package userdata;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Registration {
	static Scanner userInput = new Scanner(System.in);
	
	//*To check the Format of last name*
	public static void checkLastName() {
		String LastName = "^[A-Z]{1}[a-z]{2,}$";
		System.out.println("Enter the Last Name: ");
		String check = userInput.next();
		if (Pattern.matches(LastName, check))
			System.out.println("Enter the LastName in correct Format: ");
		else
			System.out.println("Invalid way : please try again!!!");
	}
}
