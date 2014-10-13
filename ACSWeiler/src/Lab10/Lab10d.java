package Lab10;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10d
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String question = "";
		//add in a do while loop after you get the basics up and running
		
		do{	String player = "";
		
			out.print("type in your prompt [R,P,S] :: ");
			
			player = scan.nextLine();//read in the player value
		
			RockPaperScissors game = new RockPaperScissors(player);
		out.println(game);
		out.println("Do you want to play again?(y/n)");
		question = scan.nextLine();
		}
		while( question.equalsIgnoreCase("y"));
	}
}



