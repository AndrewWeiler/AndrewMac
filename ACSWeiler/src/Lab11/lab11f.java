package Lab11;
//Name - Andrew Weiler
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class lab11f
{
	 public static void main( String args[] )
	 {
		 	Scanner keyboard = new Scanner(System.in);
	  	 	String choice = "";
	  			do{
	  				out.print("Enter the word");
	  				String test = keyboard.nextLine();

	  					//static methods can be called using the class name
	  				System.out.println( BoxWord.Alter(test) );

	  				System.out.print("Do you want to enter more data? ");
	  				choice=keyboard.next();
	  			}while(choice.equals("Y")||choice.equals("y"));
	  		}
	  	}