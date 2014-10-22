package Lab11;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import static java.lang.System.*;



	public class TriangleThree {

		// this lab is setup with a single static method
		// there are no instance variables or additional methods / constructors

		public static String createTriangle3(String let, int size) {
			String output = "";
			//return output;
			for (int i = size; i > 0; i--) {
				output += "\n";

				for (int c = i; c > 0; c--) 
					output += let + "";
				}
			
		return output;
				
		}
		
	}
