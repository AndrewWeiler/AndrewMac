package Lab11;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import static java.lang.System.*;




	public class TriangleFour {

		// this lab is setup with a single static method
		// there are no instance variables or additional methods / constructors

		public static String createTriangle4(String let, int size) {
			String output = "";
			//return output;
			int count = 1;
			for (int i = size; i > 0; i--) {
				output += "\n";
				for(int x = count; x>0; x--)
					output += " ";
					count++;
					for (int c = i; c > 0; c--)
					output +=  let;
					
					
				}
			
		return output;
				
		}
		
	}
