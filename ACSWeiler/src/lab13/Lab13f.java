package lab13;
//Name - Andrew Weiler
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

import static java.lang.System.*;

import java.io.IOException;
import java.io.File;

public class Lab13f
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("data/lab13f.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i < size; i++)
		{
		  String num = file.next();

			Average test = new Average(num);
			out.println(test);


		}
	}
}