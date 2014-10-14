package Lab10;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import java.util.Scanner;

import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	public int compChoice;
	public GuessingGame(int stop)
	{
		upperBound = stop;
		compChoice = (int) (stop*Math.random());
	}

	public void playGame()
	{	int i = compChoice;
		int top = upperBound;
		int count = 0;
		int x = 0;
		do{out.println("Enter a number between 1 and " + top);
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		count++;
		} while(i!=x);
		out.println("It took you " + count + " guesses to guess " + i);
		out.println("You guessed wrong " + (double)(1/count) + " percent of the time.");

	}

	public String toString()
	{
		String output = "";
		return output;
	}
}