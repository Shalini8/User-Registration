package userdata;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	private final String FIRST_NAME_PATTERN = "[A-Z]{1}[a-z]{2,10}";
	private final String LAST_NAME_PATTERN = "[A-Z]{1}[a-z]{2,10}";
	private final String Email_PATTERN = "^[a-zA-Z0-9]{1,}[.a-zA-Z0-9]*@[a-zA-Z0-9]{1,}.[a-z]{1,3}(.[a-z]{2})*$";
	private final String MobileNo_PATTERN = "([0-9]{2})[ ]([0-9]{10})$";
	private final String Password_PATTERN = "^(?=.*\\d)([a-z])*(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";
	Scanner userInput = new Scanner(System.in);

	public void checkPatternFirstName() {
		try {
			System.out.println("Enter your FirstNme");
			String checkPattern = userInput.nextLine();
			if (Pattern.matches(FIRST_NAME_PATTERN, checkPattern))
				System.out.println("correct Format");
			else
				throw new UserInputException("invalid Input !!!! Rewrite in correct Format");
			System.out.println("firstName :" + checkPattern);
		}catch (UserInputException e){
			System.out.println(e);
			System.out.println(e.message);
			checkPatternFirstName();
	}
}

	public void checkPatternLastName() {
		try {
			System.out.println("Enter your LasttNme");
			String checkPattern = userInput.nextLine();
			if (Pattern.matches(LAST_NAME_PATTERN, checkPattern))
				System.out.println("correct Format");
			else
				throw new UserInputException("invalid Input !!!! Rewrite in correct Format");
			System.out.println("lastname :" + checkPattern);
		}catch (UserInputException e) {
			System.out.println(e);
			System.out.println(e.message);
			checkPatternFirstName();
	}
}

	public void checkPatternEmail(){
		try {
			System.out.println("Enter your Email");
			String checkPattern = userInput.nextLine();
			if (Pattern.matches(Email_PATTERN , checkPattern))
				System.out.println("correct Format");
			else
				throw new UserInputException("invalid Input !!!! Rewrite in correct Format");
			System.out.println("EmailId  :" + checkPattern);
		}catch (UserInputException e) {
			System.out.println(e);
			System.out.println(e.message);
			checkPatternFirstName();
		}
	}

	public void checkPatternMobileNo() {
		try {
			System.out.println("Enter your MobileNo");
			String checkPattern = userInput.nextLine();
			if (Pattern.matches(MobileNo_PATTERN, checkPattern))
				System.out.println("correct Format");
			else
				throw new UserInputException("invalid Input !!!! Rewrite in correct Format");
			System.out.println("Mobileno :" + checkPattern);
		} catch (UserInputException e) {
			System.out.println(e);
			System.out.println(e.message);
			checkPatternFirstName();
		}
	}

	public void checkPatternPassword() {
		try {
			System.out.println("Enter your Password");
			String checkPattern = userInput.nextLine();
			if (Pattern.matches(Password_PATTERN , checkPattern))
				System.out.println("correct Format");
			else
				throw new UserInputException("invalid Input !!!! Rewrite in correct Format");
			System.out.println("Password :" + checkPattern);
		} catch (UserInputException e) {
			System.out.println(e);
			System.out.println(e.message);
			checkPatternFirstName();
		}
	}

	public static void main(String args[]) {
		UserRegistration user = new UserRegistration();
		user.checkPatternFirstName();
		user.checkPatternLastName();
		user.checkPatternEmail();
		user.checkPatternMobileNo();
		user.checkPatternPassword();
	}
}
