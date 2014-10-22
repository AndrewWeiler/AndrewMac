package Lab11;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class TriangleOne {

	// this lab is setup with a single static method
	// there are no instance variables or additional methods / constructors

	public static String createTriangle(String let, int size) {
		String output = "";
		//return output;
		for (int i = 1; i <= size; i++) {
			output += "\n";
		
			for (int c = 1; c <= i; c++){ 
				output += let + "";
			}
		
			
			
		}
		return output;	
			
	}
	
}

	
	
