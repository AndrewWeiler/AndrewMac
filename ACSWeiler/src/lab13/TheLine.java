package lab13;

//Name - Andrew Weiler
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class TheLine
{
 private String line;

 public TheLine(String data)
 {
	 line = data;

 }

public int getLargest()
	{	Scanner scan = new Scanner(line);
		int largest = Integer.MIN_VALUE;
		
		while(scan.hasNext()){
			int loc = scan.nextInt();
			if(loc>largest)
				largest = loc;
		}
		

		return largest;
	}

	public String toString( )
	{
		return (line + " - Largest == " + getLargest());
	}
}