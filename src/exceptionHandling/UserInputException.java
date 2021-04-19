package exceptionHandling;

	 public class UserInputException extends Exception {
	        String message;

	        //Initializing the exception
	        public UserInputException( String message) {
	            this.message=message;
	        }
	    }


