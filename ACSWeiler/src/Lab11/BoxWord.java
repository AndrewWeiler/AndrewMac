package Lab11;

//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

class BoxWord
{
 private String word;

	public BoxWord()
	{
		word="";
	}

	public BoxWord(String s)
	{

		word = s;
	}

	public void setWord(String w)
	{
		word = w;

	}

	public static String Alter(String input)
	{
		String output="";
		String word = input;
		int count = 0;
		int space = word.length()-2;
			output += word;
		   
	for(int i = 2; i<word.length(); i++){
		output += "\n";
		output += word.charAt(i);
		
		  for(int j = 0; j<space; j++){
		    	output += " ";
		   for(int x = word.length()-1; x>0; x--)    
			   output += word.charAt(word.length()-count);
		    	count++;


		  }
	}
		return output+"\n";
	}

	;
	}
