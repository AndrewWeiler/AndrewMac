package lab12;

//Name - Andrew Weiler
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class LineTotaller
{
 private String line;

	public LineTotaller()
	{
		setLine("");
	}

	public LineTotaller(String s)
	{
		line = s;
	}

	public void setLine(String s)
	{
		line = s;
	}

	public int getSum()
	{
		int total = 0;
		String loc = line;
		loc=loc.replaceAll("[\\D]+"," ");
		String[] numbers=loc.split(" ");
		
		for(int i=0;i<numbers.length;i++){
		    try{
		        total+=Integer.parseInt(numbers[i]);
		    }
		    catch( Exception e ) {
		      
		    }
		}	

		






		return total;
	}

	public String getLine()
	{
		return "";
	}

	public String toString()
	{
		return ("The sum is " + getSum());
	}
}