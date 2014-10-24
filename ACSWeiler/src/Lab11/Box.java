package Lab11;

//Name - Andrew Weiler
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Box
{

	// this lab is setup with a single static method
	// there are no instance variables or additional methods / constructors

	public static String createTriangleBox(int size) {
		String output = "";
		//return output;
		int count = 1;
		for (int i = size; i > 0; i--) {
			output += "\n";
			for(int x = i; x>0; x--)
				output += "*";
				for (int c = count; c > 0; c--)
					output +=  "#";
					count++;
				
			}
		
	return output;
			
	}
	
}
