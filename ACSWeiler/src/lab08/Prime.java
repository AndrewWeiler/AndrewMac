package lab08;
//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{
		number = 0;

	}

	public Prime(int num)
	{
		number = num;

	}

	public void setPrime(int num)
	{
		number = num;

	}

	public Boolean isPrime()
	{  
		for(int i = 2; i<Math.sqrt(number); i++)
		{if (number%i==0)
		return false;}
		
		return true;
	}

	public String toString()
	{
		String output="";
		if( isPrime() == true)
			output = (number + " is prime");
			else
				output = (number + " is not prime");
		return output;
	}
}