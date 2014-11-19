package lab13;

//Name - Andrew Weiler
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.*;

import java.lang.Math;

public class Lab13d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("data/lab14grades.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i=0; i<size; i++)
		{ 
			String data = file.nextLine();

			DogFood test = new DogFood(data);
			out.println(test);





		}
	}
}