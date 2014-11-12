package lab13;
//Name - Andrew Weiler
//Date -
//Class - 
//Lab  -

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

import static java.lang.System.*;

public class Lab13e
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("data/lab13e.dat"));
		int size = file.nextInt();
		
		for(int i=0; i<size; i++)
		{ String let = file.next();
			//String data = file.nextLine();
			int box = file.nextInt();
			
			Box test = new Box(let, box) ;
			out.println(test);





		}
	}
}