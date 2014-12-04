package AndrewMac;

import static java.lang.System.out;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SignIn extends Accounts{

String username;
String password;
	public SignIn(String name, String pass){
		username = name;
		password = pass;
	}
		      
	public void addAccount(){
		try{
			  
		String content = "This is my content which would be appended " +
	        	"at the end of the specified file";
	        //Specify the file name and path here
	    	File file = new File("writeData/userInfo.txt");

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
	    	bw.write(username + " ");
	    	bw.write(password+"\n" );
	    	//Closing BufferedWriter Stream
	    	bw.close();

		System.out.println("Your account has been created.");

	      }catch(IOException ioe){
	         System.out.println("Exception occurred:");
	    	 ioe.printStackTrace(); }
	       	
	      }
	

	public boolean checkUsername(String data) {
		String result = "Sorry, there is no account under that name." + "\n" + "Please create a new account.";
		Scanner scan = new Scanner(data);
		String loc = "";
		while(scan.hasNext()){//goes through entire text file
			loc = scan.next();
			
			if((username.compareTo(loc)==0))//checks to see if any of the usernames match
				return true; 
			
		}
		
		return false;
	}
  	
	public int usernameLocation(String data){
		Scanner scan = new Scanner(data);
		String loc = "";
		int count = 0;
		while(scan.hasNext()){//goes through entire text file
			loc = scan.next();
			count++;
			
			if((username.compareTo(loc)==0))//finds what index the username is at
				return count; 
			
		}
		
		return count;
	}
	
	public boolean checkPassword(String data) {
		String result = "Sorry, there is no account under that name." + "\n" + "Please create a new account.";
		Scanner scan = new Scanner(data);
		String loc = "";
		for(int i = usernameLocation(data)-1; i<usernameLocation(data)+1; i++){//goes through text file and stops at username index
			loc = scan.next();
			
			if((password.compareTo(loc)==0))//checks to see if any of the passwords match
				return true;
			
		}
		
		return false;
	}      
		      
	public String checkAccount(String data){//returns if the password at that index match the username
		String result = "Sorry, there is no account under that name." + "\n" + "Please create a new account.";
		if((checkUsername(data))&&(checkPassword(data)))
			result = ("You are signed in. What would you like to do now?" + "\n" + ""
		);
		
	return result;
		
	}
		 
		
		/*User account = new User(username, password);
			name.add(username);
			pass.add(password);
			*/
/*		System.out.println("Thank you ma'am/sir/it");
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
		}*/

	
		
	
	
	}
