package exceptionHandling;

public class UserRegistrationMain {
	public static void main(String args[]) {
		UserRegistration user = new UserRegistration();
		//@Calling all the methods of UserRegistrationClass
		// Various methods include to check whether the input Data are in Right Format or Not.
		user.checkPatternFirstName();
		user.checkPatternLastName();
		user.checkPatternEmail();
		user.checkPatternMobileNo();
		user.checkPatternPassword();
	}
}
