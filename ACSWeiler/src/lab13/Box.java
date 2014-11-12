package lab13;
//Name - Andrew Weiler
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Box
{
 private String let;
 private int size;

	public Box(){
		
	let = "";
	size = 0;
	}
	public Box(String a, int b){
		let = a;
		size = b;
	
	}
	

	public String toString()
	{	int loc = size;
		String word = let;
		String output="";
		
		for(int i = 0; i<loc; i++){
			for(int k = 0; k<loc; k++){
				output += word;}
			output += "\n";
		}

		return output+"\n";
	}
}