package userdata;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Registration {
	static Scanner userInput = new Scanner(System.in);
	
	//* Method to check Format of FirstName * 
	public static void checkFirstName() {
		String firstName = "^[A-Z]{1}[a-z]{2,}$";
		System.out.println("Enter the First Name: ");
		String check = userInput.next();
		if (Pattern.matches(firstName, check))
			System.out.println("Inserted FirstName : you may proceed further");
		else
			System.out.println("Invalid way : please try again!!!");
		}
	}
