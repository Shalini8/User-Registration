package userdata;

import java.util.regex.Pattern;

public class Registration {

	// * To Validate all the Emails provided
	public static void checkEmail(String email) {
		String emailPattern = ("^(?!\\.)[A-Za-z0-9]+([._%+-]?[0-9])*@[A-Za-z0-9-]+\\.[a-zA-Z]{2,6}(\\.[A-Za-z]{2,6})?$");
		if (Pattern.matches(emailPattern, email))
			System.out.println("Correct Format of Email");
		else
			System.out.println("Error !!! please check your Format");
		}
}
