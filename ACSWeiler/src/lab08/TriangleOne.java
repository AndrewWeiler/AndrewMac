package lab08;
//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="gg";
	}

	public TriangleOne(String s)
	{
		word=s;

	}


	public void setWord(String s)
	{


	}

	public void print( )
	{ for (int i = word.length(); i>0; i--)
	{ System.out.println(word.substring(0,i));
	System.out.println();
	}





	}
}