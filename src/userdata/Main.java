package userdata;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to user registration Portal");
		System.out.println("Valid emails are checked below:");

		//Valid Emails 
		Registration.checkEmail("abc@yahoo.com");
		Registration.checkEmail("abc-100@yahoo.com");
		Registration.checkEmail("abc.100@yahoo.com");
		Registration.checkEmail("abc-100@abc.net");
		Registration.checkEmail("abc.100@abc.com.au");
		Registration.checkEmail("abc@1.com");
		Registration.checkEmail("abc+100@gmail.com");
		// Check Invalid Email
		System.out.println("InValid emails are checked below:");
		Registration.checkEmail("abc");
		Registration.checkEmail("abc@.com.my");
		Registration.checkEmail(" abc123@gmail.a");
		Registration.checkEmail("abc123@.com");
		Registration.checkEmail("abc123@.com.com");
		Registration.checkEmail(".abc@abc.com");
		Registration.checkEmail("abc()*@gmail.com");
		Registration.checkEmail(" abc@%*.com");
		Registration.checkEmail("abc..2002@gmail.com");
		Registration.checkEmail("abc.@gmail.com");
		Registration.checkEmail("abc@abc@gmail.com");
		Registration.checkEmail("abc@gmail.com.1a");
		Registration.checkEmail("abc@gmail.com.aa.au ");

	}
}
