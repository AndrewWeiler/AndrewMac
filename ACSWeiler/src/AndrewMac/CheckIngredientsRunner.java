package AndrewMac;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckIngredientsRunner {
	static Scanner scan=new Scanner(System.in);
	private static Scanner file;
	static int num;
	static String loc = "";
	public static void main(String[] args) throws FileNotFoundException {
		int count=0;
		file = new Scanner(new File("recipeInfo/titles.txt"));
		Scanner stuff = new Scanner(new File("recipeInfo/ingreds.txt"));
		System.out.println("Here is a list of all current recpies:\n");
		while(file.hasNext()){	
			System.out.println(count+" "+file.nextLine());
			count++;		
		}
		//user selects which recipe they want
		System.out.println("Please enter the number corresponding with the recipe you would like to make.");
		num=scan.nextInt();
		int counter=0;
		while(counter<num){
			stuff.nextLine();
			counter++;
		}
		String myStuff=stuff.nextLine();
System.out.println("Here is a list of your ingredients needed: ");
System.out.println(myStuff);
		}
		 //CheckIngredients theRecipe=new CheckIngredients(myStuff);
		// theRecipe.ingredientCheck();
		 //System.out.println(theRecipe.getGroceries());

	}
