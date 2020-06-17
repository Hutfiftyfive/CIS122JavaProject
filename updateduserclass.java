// using the package that has three classes which are Main class, Trainer class and User class
	package User;
	// importing a java package which will later be implemented in trainer class
	import java.util.List;
	// Implementation of the user class 
	public class User {
		// Assinging name as a String
		   private String name;
		   private String age;
		   private int Weight;
	// Get method that returns the name of the user as a string
		   public String getname() {
		        return name;
		    }
		   // Using a reference this.name in order to return the name as an string
		    public void setname(String name) {
		        this.name = name;
		    }
		    // returns user name as a string, For example: if  your age was 20, it would have to be stored as " Twenty". 
		    public String getage() {
		        return age;
		    }
		    //using a reference in order to return age as a string 
		    public void setage( String age) {
		        this.age = age;
		    }
		    // returns the users age as an int
		    public int getWeight() {
		        return Weight;
		    }
		    // Using a reference so that we cant return users weight as a int 
		    public void setLastName(int Weight) {
		        this.Weight = Weight;
		    }
		    @Override
		    //  tostring method that return users information
		    public String toString() {
		        return "User [name=" + name + ", firstName=" + age + ", Weight=" + Weight + "]";
		    }
		}
