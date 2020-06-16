	// using the package that has three classes
	package User;
	// Package used for Arraylist
	import java.util.ArrayList;
	// Public Class User  from the user package
	public class User {
		// Assinging name as a String
		   private String name;
		   private int age;
		   private int Weight;
		   private int heightinfeet;
		   private int heightininches;
		   public Trainer(String name, int age, int weight, int heightinfeet, int heighininches) {
		      System.out.println("Your Information");
		      // using this refrence to recall the name string 
		      this.name = name;
		      this.age= age;
		      this.Weight=Weight;
		      this.heightinfeet = heightinfeet;
		      this.heightininches= heightininches;
		     int hoursworked;
		   }
		   // Setting the hours times 25 which is the amount being payed
	public static int pay(int hours) {
		return hours*25;
	}
	// Get UserName() method that returns the user name 
	  public String getUserName()
	  {
	      return this.name;
	  }
	//Get userage method that returns the users age
	  public int getUserage()
	  {
	      return this.age;
	  
