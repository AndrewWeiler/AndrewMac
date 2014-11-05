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
		int max = 0;
		while(scan.hasNext()){
			if(scan.nextInt()>largest)
				max = scan.nextInt();
		}
		






		return max;
	}

	public String toString( )
	{
		return (line + " - Largest == " + getLargest());
	}
}