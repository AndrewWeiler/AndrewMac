package arrayList;

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word
{
	private String word;
 private static String vowels = "AEIOUaeiou";   //only one

	public Word()
	{

	}

	public Word(String wrd)
	{
		word = wrd;
	}

	public void setWord(String wrd)
	{
		word = wrd;
	}
	
	public int getNumVowels()
	{
		int count=0;
	
	for(int i = 0; i<word.length()-1; i++){
		if(word.substring(i,i+1).equals(vowels.substring(0,1))){
			count++;}
			else if(word.substring(i,i+1).equals(vowels.substring(1,2))){
				count++;}
				else 
			if(word.substring(i,i+1).equals(vowels.substring(2,3))){
				count++;}
				else 
			if(word.substring(i,i+1).equals(vowels.substring(3,4))){
				count++;}
				else 
			if(word.substring(i,i+1).equals(vowels.substring(4,5))){
				count++;}
				else 
			if(word.substring(i,i+1).equals(vowels.substring(5,6))){
				count++;}
				else 
					if(word.substring(i,i+1).equals(vowels.substring(6,7))){
				count++;}
				else 
			if(word.substring(i,i+1).equals(vowels.substring(7,8))){
				count++;}
				else if(word.substring(i,i+1).equals(vowels.substring(8,9))){
					count++;}
					else 
				if(word.substring(i,i+1).equals(vowels.substring(9,10))){
					count++;}
					else 
				if(word.substring(i,i+1).equals(vowels.substring(10))){
					count++;
					
				}
			}
		return count;
	}
	
	public int getLength()
	{
		return 0;
	}

	public String toString()
	{
	   return (word + "\n" + "vowels == " +getNumVowels() + "\n" + "num chars == " +(word.length()));
	}
}