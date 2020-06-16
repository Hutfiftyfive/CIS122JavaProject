//Exception for InvalidFoodGroup selection
public class InvalidFoodGroupException extends Exception {
	
	public InvalidFoodGroupException() {
		super("Sorry, that food group is not in the database.");
	}
	
	public InvalidFoodGroupException(String message) {
		super(message);
	}

}
