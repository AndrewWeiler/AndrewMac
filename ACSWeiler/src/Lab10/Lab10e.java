package Lab10;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import java.util.Scanner;

import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
	Scanner scan = new Scanner(System.in);
	String question = " ";
	
	
	do{	int guess = 0;
	
		out.print("Guessing game - how many?");
		guess = scan.nextInt();//read in the player value
	
		GuessingGame game = new GuessingGame(guess);
	game.playGame();
	out.println(game);
	out.println("Do you want to play again?(y/n)");
	question = scan.nextLine();
	}
	while( question.equalsIgnoreCase("y"));
}
}

