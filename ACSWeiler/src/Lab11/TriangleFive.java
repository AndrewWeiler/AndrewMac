
package Lab11;

public class TriangleFive {

	// this lab is setup with a single static method
	// there are no instance variables or additional methods / constructors

	public static String createTriangle5(String let, int size) {
		String output = "";
		int count = 0;
		int count2 = 0;
		char test = let.charAt(0);
		do{
		for (int i = 1; i <= size-count; i++) {
				output += "\n";
			
			for (int c = 1; c <= size-count; c++){ 
				output += ((char)(test+count)) + "";
			}
		}
		count++;

		}while(count<=size);
		
			
			
	
		
	

		return output;
}
}
