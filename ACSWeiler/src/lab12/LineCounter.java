package lab12;
//Name - Andrew Weiler
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class LineCounter
{
 private String line;

 public LineCounter()
 {
		setLine("");
 }

 public LineCounter(String s)
 { 
	 line = s;
 }

	public void setLine(String s)
	{
		line = s;
	}

	public int getCount()
	{	String loc = line;
		int count=0;
		for(int i = 0; i<loc.length(); i++){
			if(loc.substring(i,i+1).equals(" "))
				count++;
				}
		
		
		
		
		return count;
	}

	public String toString()
	{
		return line;
	}
}