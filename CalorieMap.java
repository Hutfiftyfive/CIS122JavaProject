//This map contains some basic food groups and their approximate caloric value

import java.util.HashMap;
import java.util.Scanner;

public class CalorieMap {
	
	public static void main(String[] args) {
		
		//fruit calorie map
		HashMap<String, Integer> fruitCalorieMap = new HashMap<String, Integer>();
		
		fruitCalorieMap.put("Apple", 95);
		fruitCalorieMap.put("Banana", 100);
		fruitCalorieMap.put("Clementine", 35);
		fruitCalorieMap.put("Mango", 202);
		fruitCalorieMap.put("Peach", 59);
		fruitCalorieMap.put("Orange", 62);
		fruitCalorieMap.put("Passion Fruit", 17);
		fruitCalorieMap.put("Pear", 101);
		fruitCalorieMap.put("Blueberries", 84);
		
		//vegetable calorie map
		HashMap<String, Integer> vegetableCalorieMap = new HashMap<String, Integer>();
		
		vegetableCalorieMap.put("Broccoli",50);
		vegetableCalorieMap.put("Carrot", 41);
		vegetableCalorieMap.put("Cuccumber",50);
		vegetableCalorieMap.put("Cauliflower",146);
		vegetableCalorieMap.put("Cherry tomato",20);
		vegetableCalorieMap.put("Green Beans",31);
		vegetableCalorieMap.put("Zucchini",33);
		
	
		//meat and protein substitute calorie map
		
		HashMap<String, Integer> meatCalorieMap = new HashMap<String, Integer>();
		meatCalorieMap.put("Chicken breast", 200);
		meatCalorieMap.put("Pork chop", 257);
		meatCalorieMap.put("Ground beef patty", 172);
		
		//more to be added
		
	}
}
