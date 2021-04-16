package userdata;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Registration {
	static Scanner userInput = new Scanner(System.in);
	
	//* To check the Format of Mobile number *
		public static void checkPhoneNumber() { 
			String phoneNumber = "([0-9]{2})[ ]([0-9]{10})$";
			System.out.println("Enter the PhoneNo: ");
			String check = userInput.nextLine();
			if (Pattern.matches(phoneNumber, check))
				System.out.println("Correct Format of Phone no");
			else
				System.out.println("Invalid: please try again!!!");
		}
}
