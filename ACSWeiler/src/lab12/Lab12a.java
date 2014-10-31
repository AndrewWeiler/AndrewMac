package lab12;

//Name - Andrew Weiler
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab12a
{
 public static void main( String args[] )
 {
		LineCounter test = new LineCounter("9 10 5 20 1 2 3");
		out.println(test);
		out.println("count = "+test.getCount()+"\n\n");

		LineCounter test2 = new LineCounter("1 7 4 10 29 4");//add more test cases
		out.println(test2);
		out.println("count = "+test2.getCount()+"\n\n");
		
		
		
		
	}
}