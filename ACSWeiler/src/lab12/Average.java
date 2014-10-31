package lab12;

//Name - Andrew Weiler
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

import static java.lang.System.*;

public class Average
{
 private String line;

 public Average()
 {
	 line = "";

 }

 public Average(String s)
 {
	 line = s;

 }

	public void setLine(String s)
	{
		line = s;

	}

	public double getCount()
	{
		double count=0;
		String loc = line;
		loc=loc.replaceAll("[\\D]+"," ");
		String[] numbers=loc.split(" ");
		
		count = numbers.length;
		
		return count;
	}


	public double getSum()
	{
		double total = 0;
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

	public double getAverage()
	{
		double average=0.0;
		average = (getSum()/getCount())*1000;
		double rounded = (average)/1000 ;
		average = rounded;
		return average;
	}

	public String getLine()
	{
		return "";
	}

	public String toString()
	{
		return (line + "\n" + "The average is " + getAverage());
	}
}