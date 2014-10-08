package Lab10;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;
	

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;


	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;

	}

	public double getBiggest()
	{
		double max = 0.0;
		{if(one>two&&one>three&&one>four)
			max = one;
		if(two>one&&two>three&&two>four)
			 max = two;
		if(three>two&&three>one&&three>four)
			max = three;
		else max = four;
		}
		
		return max;
	}

	public String toString()
	{
	   return ("biggest = " +getBiggest());
	}
}