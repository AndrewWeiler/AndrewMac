package lab14;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import java.util.Scanner;

public class Histogram
{
	private int [] numCount;

	public Histogram(String input){
	setList(input);
	}
	
	public void setList(String line){
		numCount = new int[10];
		Scanner scan = new Scanner(line);
		while (scan.hasNextInt()){
			int num = scan.nextInt();
			numCount[num]++;
		}
	}
	
	public String toString(){
		String output = "";
	for(int i = 0; i<10; i++)
		output +=i + " - " + numCount[i] + "\n";
	return output;
	}
}