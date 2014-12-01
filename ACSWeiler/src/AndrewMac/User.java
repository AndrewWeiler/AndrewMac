package AndrewMac;

import static java.lang.System.*;

import java.io.File;
import java.util.Scanner;

public class User {
	public static void main( String args[] ){	

	Scanner scan = new Scanner(System.in);
	DataReader myDataReader = new DataReader();
	
	System.out.println("Do you have an account? (y/n)");
	String input = scan.nextLine();
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
						myDataReader.returnData("writeData/userInfo.txt");

							SignIn test = new SignIn(data); //reads in from the userInfo data file
							account.checkAccount(data); //checks to see if one exists


		}

}
}}