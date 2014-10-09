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
	private String playChoice;
	public int playChoiceInt;
	private int compChoice;

	public RockPaperScissors()
	{
		playChoice = "";
		compChoice = 0;
		playChoiceInt = 0;

	}

	public RockPaperScissors(String player)
	{
		playChoice =player;
		if(player.equals("R"))
			playChoiceInt = 0;
		if(player.equals("P"))
			playChoiceInt = 1;
		if(player.equals("S"))
			playChoiceInt = 2;
		compChoice = (int) (2*Math.random());
	}

	public void setPlayers(String player)
	{
		if(player.equals("R"))
			playChoiceInt = 0;
		if(player.equals("P"))
			playChoiceInt = 1;
		if(player.equals("S"))
			playChoiceInt = 2;
		compChoice = (int) (2*Math.random());
		
	}

	public String determineWinner()
	{	int i = compChoice;
		
		String winner="";
		out.println(i);
		





		return winner;
	}

	public String toString()
	{
		String output=( determineWinner()+"");

		return output;
	}
}