import java.util.HashMap;
import java.util.Scanner;

public class Recursion {
    static int num = 0; //variable to be used to add up calories static so it can be accessed inside the method


    public static int recursion(String food) //recursion method
    {
        String temp, group;
        Scanner input = new Scanner(System.in); //implementation of scanner

        //HASH MAP DONE BY EDWARD DOMINQUEZ
        // Start of his code -------------------------------------------------------------------------------------------
        HashMap<String, Integer> fruitCalorieMap = new HashMap<String, Integer>();

        fruitCalorieMap.put("apple", 95);
        fruitCalorieMap.put("banana", 100);
        fruitCalorieMap.put("clementine", 35);
        fruitCalorieMap.put("mango", 202);
        fruitCalorieMap.put("peach", 59);
        fruitCalorieMap.put("orange", 62);
        fruitCalorieMap.put("passion fruit", 17);
        fruitCalorieMap.put("pear", 101);
        fruitCalorieMap.put("blueberries", 84);

        //vegetable calorie map
        HashMap<String, Integer> vegetableCalorieMap = new HashMap<String, Integer>();

        vegetableCalorieMap.put("broccoli", 50);
        vegetableCalorieMap.put("carrot", 41);
        vegetableCalorieMap.put("cucumber", 50);
        vegetableCalorieMap.put("cauliflower", 146);
        vegetableCalorieMap.put("cherry tomato", 20);
        vegetableCalorieMap.put("green beans", 31);
        vegetableCalorieMap.put("zucchini", 33);


        //meat and protein substitute calorie map
            HashMap<String, Integer> meatCalorieMap = new HashMap<String, Integer>();
            meatCalorieMap.put("chicken breast", 200);
            meatCalorieMap.put("pork chop", 257);
            meatCalorieMap.put("ground beef patty", 172);

            //END OF EDWARDS CODE-------------------------------------------------------------------------------------

            if (!food.equalsIgnoreCase("done")){ //checks if the user wants to add more food or not

            System.out.println("What food group are you looking for? Meat, Vegetable, Fruit"); //text prompt
            System.out.print("Or if you are done type Done: ");
            group = input.nextLine();//change to next line when String implementation is implemented


            //recursion part for meat
            if (group.equalsIgnoreCase("Meat")){//if statement for food group
                System.out.print("What food did you eat? "); //user prompt for next step
                food = input.nextLine();       // uses scanner input for getting the food
                if (meatCalorieMap.containsKey(food.toLowerCase())){  // checks if hashmap contains the food the user input
                    num += meatCalorieMap.get(food.toLowerCase());  //adds up the calorie amount
                }
                else
                {
                    System.out.println("Im sorry we don't have that food in our database. "); //text prompt
                }
                recursion(food);           //recalls the method
            } //recursion part for vegetables
            else if (group.equalsIgnoreCase("Vegetable")){
                System.out.print("What food did you eat? ");
                food = input.nextLine();
                if (vegetableCalorieMap.containsKey(food)){
                    num += vegetableCalorieMap.get(food.toLowerCase());
                }
                else
                {
                    System.out.println("Im sorry we don't have that food in our database. ");
                }
                recursion(food);
            }//recursion part for fruit
            else if (group.equalsIgnoreCase("Fruit")){
                System.out.print("What food did you eat? ");
                food = input.nextLine();
                if (fruitCalorieMap.containsKey(food)){
                    num += fruitCalorieMap.get(food.toLowerCase());
                }
                else
                {
                    System.out.println("Im sorry we don't have that food in our database. ");
                }
                recursion(food);
            }
            else if (!group.equalsIgnoreCase("done"))
            {
                System.out.println("You have entered an incorrect food group, try again."); //text prompt
                recursion(food);            //recalls the recursion method
            }
        }
        System.out.print("Total calorie amount is: "); //text prompt
        return num; //returns the final value
    }

    public static void main(String[] args) {
        String temp = "temp"; //variable used for method call

        System.out.println(recursion(temp) + "  calories"); //initial call of the method and prints out result

    }
}