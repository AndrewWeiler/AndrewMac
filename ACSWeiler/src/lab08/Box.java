package lab08;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Box
{
	private static String word;

	public Box()
	{
     word = "";

	}

	public Box(String s)
	{
		word=s;

	}

	public static void setWord(String s)
	{
		word=s;
	}

	public void print( )
	{ 
		for(int i = 0; i<word.length(); i++)
		{System.out.println(word);


	}
		System.out.println();
		
	}
}