package AndrewMac;


import java.util.Scanner;

public class RecipeOne {
String title;
String ingred;
int count;
Scanner scan=new Scanner(System.in);
public RecipeOne(){
	
}
public RecipeOne(String name, String stuff){
	title=name;
	ingred=stuff;
}
public String getTitle(){
	return title;
}

public String getIngred(){
	return ingred;
}
public void addIngredients() {
	//choice determines if there are more ingredients to be added
	String choice = "y";
	// adds in ingredients until user is done
	while (choice.equalsIgnoreCase("y")) {
		System.out.println("What ingredient would you like to add?(please enter amount as well)");
		ingred+=scan.next()+"\n";
		//asks if user has any more ingredients to add
		System.out
				.println("Would you like to add any more ingredients?(y/n)");
		choice = scan.next();
	}
	//when the user says they have no more ingredients, print return statement
	if (choice.equalsIgnoreCase("n")) {
		//once the user is done adding info, the RecipeOne
		//object is added to an ArrayList
		System.out.println("There are no more ingredients to be added "
				+ "for this recipe, this list is complete.");
	}
}
public String toString(){
	String output="";
	count = 0;
	Scanner line = new Scanner(ingred);
	while(line.hasNext()){
		output+=line.nextLine()+" ";
		count++;}
	return output;
}
}
