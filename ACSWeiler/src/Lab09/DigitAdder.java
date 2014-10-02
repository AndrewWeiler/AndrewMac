package Lab09;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class DigitAdder
{  int i = 0;

	public DigitAdder(int a)
	{ i = a; 
	
	}
 public static int sumDigits( int number )
	{
		int sum=0;
		return sum;
	}
 
 public int findSum(){
  int sum = 0;
 int x = i;
 while (x>0)
 { 
	sum += x%10;
	x = x/10;
	 
}
 return sum;
 
}
 public String toString()
 { String print = "";
 print = (findSum() + " is the sum of " + i);
 return print;
}
}