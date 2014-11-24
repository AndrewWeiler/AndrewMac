package AndrewMac;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
		      try{
		    	String content = "This is my content which would be appended " +
		        	"at the end of the specified file";
		        //Specify the file name and path here
		    	File file =new File("writeData/userInfo.txt");

		    	/* This logic is to create the file if the
		    	 * file is not already present
		    	 */
		    	if(!file.exists()){
		    	   file.createNewFile();
		    	}
		    	
		    	//Here true is to append the content to file
		    	FileWriter fw = new FileWriter(file,true);
		    	//BufferedWriter writer give better performance
		    	BufferedWriter bw = new BufferedWriter(fw);
		    	bw.write("\n" +username + " ");
		    	bw.write(password);
		    	//Closing BufferedWriter Stream
		    	bw.close();

			System.out.println("Data successfully appended at the end of file");

		      }catch(IOException ioe){
		         System.out.println("Exception occurred:");
		    	 ioe.printStackTrace();
		       }
		  
		
		
		/*User account = new User(username, password);
			name.add(username);
			pass.add(password);
			*/
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

	
}
	
	
}
