package AndrewMac;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckIngredients {
	Scanner scan = new Scanner(System.in);
	String ingreds;
	Scanner line=new Scanner(ingreds);
	// list being read into
	ArrayList<String> groceries = new ArrayList<String>();

	CheckIngredients(String ingredStuff) {
		ingreds=ingredStuff;
	}

	// checks if user has ingredients and add ones they don't have to grocery
	// ArrayList
	public void ingredientCheck() {
		// goes through each ingredient in RecipeOne Object
		while(line.hasNext()){
			String choice="";
			System.out.println("The next ingredents is "+line.nextLine()+" do you have this?");
			choice=scan.nextLine();
			if (choice.equalsIgnoreCase("n")) {
				groceries.add(line.nextLine());
				System.out
						.println("That ingredient was added to your grocery list");
		}
		}
	}

	public String getGroceries() {
		String myReturn = "";
		for (String b : groceries) {
			myReturn += b + "\n";
		}
		return "This is your grocery list:\n" + myReturn;
	}
}