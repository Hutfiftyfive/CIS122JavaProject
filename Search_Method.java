import java.util.HashMap;
import java.util.Scanner;
public class Search_Method {

    public static void search(String group, String food) //takes in two variables and returns nothings
    {
        int num = 0;
        //START OF EDWARDS CODE---------------------------------------------------------------------------------------
                //fruit calorie map
                HashMap<String, Integer> fruitCalorieMap = new HashMap<String, Integer>();

                fruitCalorieMap.put("apple", 95);
                fruitCalorieMap.put("banana", 100);
                fruitCalorieMap.put("clementine", 35);
                fruitCalorieMap.put("mango", 202);
                fruitCalorieMap.put("peach", 59);
                fruitCalorieMap.put("orange", 62);
                fruitCalorieMap.put("passion Fruit", 17);
                fruitCalorieMap.put("pear", 101);
                fruitCalorieMap.put("blueberries", 84);

                //vegetable calorie map
                HashMap<String, Integer> vegetableCalorieMap = new HashMap<String, Integer>();

                vegetableCalorieMap.put("broccoli",50);
                vegetableCalorieMap.put("carrot", 41);
                vegetableCalorieMap.put("cucumber",50);
                vegetableCalorieMap.put("cauliflower",146);
                vegetableCalorieMap.put("cherry tomato",20);
                vegetableCalorieMap.put("green beans",31);
                vegetableCalorieMap.put("zucchini",33);


                //meat and protein substitute calorie map

                HashMap<String, Integer> meatCalorieMap = new HashMap<String, Integer>();
                meatCalorieMap.put("chicken breast", 200);
                meatCalorieMap.put("pork chop", 257);
                meatCalorieMap.put("ground beef patty", 172);
//END OF EDWARDS CODE ------------------------------------------------------------------------------------

                if (group.equalsIgnoreCase("meat")) //checks for what food group the user selected
                {
                    if (meatCalorieMap.containsKey(food.toLowerCase())) //checks if we have the food the user input in our database
                    num = meatCalorieMap.get(food.toLowerCase());       //sets calorie value equal to num
                    else
                    {
                        System.out.println("Sorry we don't have that food in our database"); //text prompt
                    }
                }
                else if (group.equalsIgnoreCase("vegetable"))
                {
                    if (vegetableCalorieMap.containsKey(food.toLowerCase()))
                       num = vegetableCalorieMap.get(food.toLowerCase());
                    else
                    {
                        System.out.println("Sorry we don't have that food in our database");
                    }
                }
                else if (group.equalsIgnoreCase("fruit"))
                {
                    if (fruitCalorieMap.containsKey(food.toLowerCase()))
                      num =  fruitCalorieMap.get(food.toLowerCase());
                    else
                    {
                        System.out.println("Sorry we don't have that food in our database");
                    }
                }

        if (num != 0) //checks if num has a valid input
        {
            System.out.println(food + " has " + num + " calories in it."); //text prompt
        }
    }
    public static void main(String[] args)
    {

	    Scanner input = new Scanner(System.in); //user input
        String food, group;

        System.out.print("What food group are you looking for Meat, Fruit, or Vegetable? ");
        group = input.nextLine(); //user input is used to get food group

        //checks if user input a valid food group
        if ( group.equalsIgnoreCase("meat") || group.equalsIgnoreCase("fruit") || group.equalsIgnoreCase("vegetable"))
        {
            //text prompt
        System.out.print("What food are you looking for? ");
        //user input is used to get food group
	    food = input.nextLine(); //user input

            //calls the method search and inputs 2 varaibles
            search(group, food);
        }
        else
            {
                //text prompt
            System.out.println("Sorry that food group doesn't exist in our database");
         }

    }
}
