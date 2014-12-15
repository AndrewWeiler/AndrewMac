package AndrewMac;

import static java.lang.System.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class User {
	public static void main( String args[] ) throws IOException{	

	Scanner scan = new Scanner(System.in);
	DataReader myDataReader = new DataReader();
	String input = "";
	
	System.out.println("Do you have an account? (y/n)");
	input = scan.nextLine();
	while(!((input.equalsIgnoreCase("y"))||(input.equalsIgnoreCase("n")))){//makes sure they enter in "y" or "n"{
		System.out.println("Invalid input please try again.");
		System.out.println("Do you have an account? (y/n)");
		input = scan.nextLine();
	}
	
		if(input.equalsIgnoreCase("n")){
			System.out.println("Please create a username: ");
				String username = scan.nextLine();
			System.out.println("Please create a password: ");
				String password = scan.nextLine();
				SignIn account = new SignIn(username, password);
				account.addAccount();//adds a new account if one doesn't exist
				
			}
			else
				{System.out.println("Please enter a username: ");
					String username = scan.nextLine();
				System.out.println("Please enter a password: ");
					String password = scan.nextLine();	
					SignIn account = new SignIn(username, password);
				out.println(account.checkAccount(myDataReader.returnData("writeData/userInfo.txt"))); //checks to see if account exists
				if(account.checkAccount(myDataReader.returnData("writeData/userInfo.txt")).equals("Sorry, there is no account under that name." + "\n" + "Please create a new account.")){
					System.out.println("Create a username: ");
					String username2 = scan.nextLine();
				System.out.println("Create a password: ");
					String password2 = scan.nextLine();
					SignIn account2 = new SignIn(username2, password2);
					account2.addAccount();//adds a new account if one doesn't exist
				
				}
			
			
			/*	String loc = scan.nextLine();
				if(loc.equalsIgnoreCase("")){
					
				}
				if(loc.equalsIgnoreCase("")){
					
				}
				if(loc.equalsIgnoreCase("")){
	
				}*/
				ArrayList<String> recipeTitles = new ArrayList<String>();
				ArrayList<String> recipeIngreds = new ArrayList<String>();
				// string variable for the user's choice to add recipe or not
				String str = "";
				// prompt reader for recipe
				System.out
						.println("Would you like to add a recipe to the database?(y/n)");
				// reader makes choice
				str = scan.nextLine();
				// if yes, instantiate new recipe ArrayList with title and ingredients
				if (str.equalsIgnoreCase("y")) {
					System.out
							.println("You are adding a new recipe, please enter the title of this recipe: ");
					RecipeOne myRecipe = new RecipeOne(scan.nextLine(),"");
					myRecipe.addIngredients();
					recipeTitles.add(myRecipe.getTitle());
					recipeIngreds.add(myRecipe.getIngred());
					try {
						// Specify the file name and path here
						File titles = new File("recipeInfo/titles.txt");
						File ingreds = new File("recipeInfo/ingreds.txt");

						// This logic is to create the file if the
						// file is not already present

						if (!titles.exists()) {
							titles.createNewFile();
						}
						if(!ingreds.exists()){
							ingreds.createNewFile();
						}

						// Here true is to append the content to file
						FileWriter tw = new FileWriter(titles, true);
						FileWriter iw = new FileWriter(ingreds, true);
						// BufferedWriter writer give better performance
						BufferedWriter bw = new BufferedWriter(tw);
						BufferedWriter bwt = new BufferedWriter(iw);
						bw.write(recipeTitles + "\n");
						bw.close();
						bwt.write(recipeIngreds +  "\n");
						// Closing BufferedWriter Stream
						bwt.close();

						System.out
								.println("Data successfully appended at the end of file");

					} catch (IOException ioe) {
						System.out.println("Exception occurred:");
						ioe.printStackTrace();
					}
				}
				// ***add to database***
				// if no, tell user what will happen
				if (str.equalsIgnoreCase("n")) {
					System.out.println("No recipes are to be added at this time.");
				}

			}
		}
		
		

}
