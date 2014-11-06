package lab13;

//Name - Andrew Weiler
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class Social
{
 private String socialNum;

	public Social(String soc)
	{
		socialNum = soc;

	}

	public void setSocial(String soc)
	{
		socialNum = soc;

	}

	public int getSum()
	{
		Scanner scan = new Scanner(socialNum);
		int sum = 0;
		scan.useDelimiter("\\p{Punct}");
		while(scan.hasNext()){
			sum +=  scan.nextInt();
			
		}
		

		return sum;
	}

	public String toString()
	{
		return ( "SS# " + socialNum + " has a sum of " + getSum());
	}
}