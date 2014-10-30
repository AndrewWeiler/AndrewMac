package Lab11;

//Name -Andrew Weiler
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;
public class Lab11j
{
 public static void main(String args[])
 {  Scanner scan = new Scanner(System.in);
	 System.out.println("Enter in a number");
	 int num = scan.nextInt();
  System.out.println(Triples.findTriples(num));

	}
}