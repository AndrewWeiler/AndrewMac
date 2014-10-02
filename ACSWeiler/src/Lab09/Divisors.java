package Lab09;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Divisors
{ static int i = 0;
  int a = 0;
  public Divisors(int number)
  { i = number;
	  
  }
	public static String getDivisors( int number )
	{	int y = 1;
		String divisors="";
		
		while(y<i)
		 {if(i%y==0)
		divisors += (y +" ");
		y++;
	}return divisors;
			
	}
	
	
	
 public String toString()
 { String x = "";
 x = (i + " has divisors of " + getDivisors(i) );
	 return x;
}
}