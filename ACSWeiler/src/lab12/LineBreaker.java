package lab12;
//Name - Andrew Weiler
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class LineBreaker
{
 private String line;
 private int breaker;

 public LineBreaker()
 {
 	this("",0);
 }

 public LineBreaker(String s, int b)
 {
	 line = s;
	 breaker = b;

 }

	public void setLineBreaker(String s, int b)
	{
		 line = s;
		 breaker = b;

	}

	

	public String getLineBreaker()
	{	int increment = breaker;
		String box = "";
		String loc = line;
		loc=loc.replaceAll("\\s+","");
		for(int i = 0; i<loc.length();i+=increment)
		{	if(increment>loc.length()-i)
		{box += loc.substring(i);}
		else 
		box += loc.substring(i,i+increment);
			box+="\n";
		
		}
	

		
		
	return box;
	}

	public String toString()
	{
		return (line + "\n" + getLineBreaker());
	}
}