package userdata;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Registration {
	static Scanner userInput = new Scanner(System.in);

	// * To Validate the Password *
	public static void checkPassword() {
		String password = "^[a-zA-Z0-9]{8,}$"; // MINIMUM 8 characters
		System.out.println("Enter the Password should be minimum of 8 characters: ");
		String check = userInput.next();
		if (Pattern.matches(password, check))
			System.out.println("Valid Password");
		else
			System.out.println("Password is Invalid: please try again!!!");
	}
}
