package AndrewMac;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import lab13.TheLine;
import static java.lang.System.out;
import static java.util.Arrays.asList;

public class Accounts /*{
	static ArrayList<String> name = new ArrayList<String>();
	static ArrayList<String> pass = new ArrayList<String>();
	
}
*/
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("writeData/userInfo.txt"));
		int size = file.nextInt();
		file.nextLine();
		for(int i=0; i<size; i++)
		{ 
			String data = file.nextLine();

			SignIn test = new SignIn(data); //reads in from the userInfo test file
			out.println(test);//adds the recipe to a new file





		}
	}
}
