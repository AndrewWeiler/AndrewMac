package lab13;

//Name - Andrew Weiler
//Date -
//Class - 
//Lab  -

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

import static java.lang.System.*;

public class Lab13b
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("data/lab13b.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i=0; i<size; i++)
		{ 
			String data = file.next();

			TheLine test = new TheLine(data);//instantiate an OddOrEven
			out.println(test);





		}
	}
}