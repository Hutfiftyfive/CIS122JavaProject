//Class for InvalidFoodException

public class InvalidFoodException extends Exception {
	
	public InvalidFoodException() {
		super("Sorry, that food was not found. ");
	}
	
	public InvalidFoodException (String message) {
		super(message);
	}

}
