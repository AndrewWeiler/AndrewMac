
package Lab11;

//Name - Andrew Weiler
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class lab11i
{
 public static void main(String args[])
 {
	 	Scanner keyboard = new Scanner(System.in);
	 	String choice="";
			do{
				out.print("Enter the word: ");
				String value = keyboard.nextLine();

					//static methods can be called using the class name
				System.out.println(TriangleWord.createTriangle(value)); 
				System.out.print("Do you want to enter more data? ");
				choice=keyboard.next();
			}while(choice.equals("Y")||choice.equals("y"));
		}
	}