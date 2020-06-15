//This map contains some basic food groups and their approximate caloric value
import java.util.HashMap;

	

public class CalorieMap {
	
	public static void main(String[] args) {
		//the food name is key tied to a calorie value
		//all foods are lower case to work with .ignoreCase
		
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
		vegetableCalorieMap.put("cuccumber",50);
		vegetableCalorieMap.put("cauliflower",146);
		vegetableCalorieMap.put("cherry tomato",20);
		vegetableCalorieMap.put("green Beans",31);
		vegetableCalorieMap.put("zucchini",33);
		
	
		//meat and protein substitute calorie map
		HashMap<String, Integer> meatCalorieMap = new HashMap<String, Integer>();
		
		meatCalorieMap.put("chicken breast", 200);
		meatCalorieMap.put("pork chop", 257);
		meatCalorieMap.put("ground beef patty", 172);
		meatCalorieMap.put("salmon", 220);
		meatCalorieMap.put( "kidney",200 );
		meatCalorieMap.put("honey ham (1 slice)", 27);
		meatCalorieMap.put("turkey breast(1 slice)", 22);
		
		
		
		//dairy calorie map
		HashMap<String, Integer> dairyCalorieMap = new HashMap<String, Integer>();
		
		dairyCalorieMap.put("almond milk (unsweetened)", 40);
		dairyCalorieMap.put("plain yogurt", 138);
		dairyCalorieMap.put("whole milk", 149);
		dairyCalorieMap.put("skim milk", 86);
		dairyCalorieMap.put("rice milk", 120);
		dairyCalorieMap.put("string cheese", 70);
		dairyCalorieMap.put("swiss cheese", 95);
		
		//bread and grain calorie map
		HashMap<String, Integer> grainCalorieMap = new HashMap<String, Integer>();
		
		grainCalorieMap.put("plain bagel", 252);
		grainCalorieMap.put("english muffin", 129);
		grainCalorieMap.put("garlic bread",151);
		grainCalorieMap.put("white bread (1 slice)", 79);
		grainCalorieMap.put("whole wheat bread (1 slice)", 114);
		
		

	}
}
