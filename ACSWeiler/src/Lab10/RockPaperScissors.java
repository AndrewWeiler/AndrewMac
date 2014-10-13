package Lab10;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import java.util.Random;

import static java.lang.System.*;

public class RockPaperScissors
{
	
	public String playChoice;
	private int compChoice;
	public String compString;
	public RockPaperScissors()
	{
		playChoice = "";
		{compChoice = (int) (2*Math.random());
		if(compChoice == 0)
			compString = "R";
		if(compChoice == 1)
			compString = "P";
		else
			compString = "S";}
	}

	public RockPaperScissors(String player)
	{
		playChoice =player;
		
		{compChoice = (int) (2*Math.random());
		if(compChoice == 0)
			compString = "R";
		if(compChoice == 1)
			compString = "P";
		else
			compString = "S";}
	}

	public void setPlayers(String player)
	{
		playChoice =player;
		{compChoice = (int) (2*Math.random());
		if(compChoice == 0)
			compString = "R";
		if(compChoice == 1)
			compString = "P";
		else
			compString = "S";}
	}

	public String determineWinner()
	{	String comp = compString;
		String playerIn = "";
		String winner = "";
		playerIn = playChoice;
		out.println("Your choice was " +playerIn);
		out.println("The computer picked " + comp);
		
		if(playerIn.equals("R")&&comp.equals("S"))
			return "Player "+ playerIn;
		if(playerIn.equals("P")&&comp.equals("R"))
			return "Player "+ playerIn;
		if(playerIn.equals("S")&&comp.equals("P"))
			return "Player "+ playerIn;
		else 
		winner = "Computer " + comp;


		return winner;
	}

	public String toString()
	{
		String output=("The winner was " + determineWinner()+ " beats " + compString);

		return output;
	}
}