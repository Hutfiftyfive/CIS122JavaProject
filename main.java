//using the package that has three classes which are Main class, Trainer class and User class
package User;
// importing a java package which will later be implemented in trainer class
import java.util.List;
// Implementation of Main class
public class Main {
	// Argument statement
	 public static void main(String[] args) 
	    {
		 // Adding a new name to the trainer
	        Trainer trn= new Trainer();
	
	        trn.setname("James");
	        trn.setage("Twenty");
	         // Printing out the trn which has stored name and age 
	        System.out.println(trn);
	    }
	

}
