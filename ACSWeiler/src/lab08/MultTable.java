package lab08;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class MultTable
{
	private static int number;
	private static int stop;

	public MultTable()
	{
		number=stop=0;
	}

	public MultTable(int num, int end)
	{
		number = num;
		stop = end;


	}

	public void setTable(int num, int end)
	{



	}

	public static void printTable( )
	{
		{for(int i = 1; i<=stop; i++)
		{System.out.println(i + "          " + number*i);
		
		}System.out.println();}




	}
}