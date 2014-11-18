package lab14;

import java.util.Arrays;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

public class OddsAndEvensRunner
{
	public static void main( String args[] )
	{
		int [] one = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Odds - [" +Arrays.toString(OddsAndEvens.getOdds(one)) + "] " + "\n");
		System.out.println("Evens - [" + Arrays.toString(OddsAndEvens.getEvens(one)) + "] " + "\n");
	}

}
