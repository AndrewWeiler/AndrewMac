package AndrewMac;

import java.util.Scanner;

public class UserInfo extends Accounts{
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Do you have an account? (y/n)");
	String input = scan.nextLine();
	if(input.equalsIgnoreCase("n")){
		System.out.println("Please create a username: ");
		String username = scan.nextLine();
		System.out.println("Please create a password: ");
		String password = scan.nextLine();
		User account = new User(username, password);
			name.add(username);
			pass.add(password);
		System.out.println("Thank you ma'am/sir/it");
	}
	else 
	{ 	System.out.println("Please enter your username: ");
	String username = scan.nextLine();
	System.out.println("Please enter your password: ");
	String password = scan.nextLine();
	User account = new User(username, password);
		int nameLoc = name.indexOf(username);
		if(password.equals(pass.get(nameLoc)))
		{
			System.out.println("Nice!");
		}
		else { System.out.println("Not nice!");
		}
		}
)
	
}
	
	
}
