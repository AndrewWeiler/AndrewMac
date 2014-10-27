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
		output += input;
		int count = input.length()-1;
		for(int i = 1; i<input.length()-1; i++){
			output+= "\n"+input.charAt(i) ;
			count--;
			for(int j = 0; j<input.length()-2; j++){
				output+= " ";
			}	
			
			output+=input.charAt(count);
			
		  }
		StringBuffer sb = new StringBuffer(input);
		output += "\n"+ sb.reverse();
	
		return output+"\n";
	}

	
	}
