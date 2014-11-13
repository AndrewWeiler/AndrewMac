package lab13;

//Name - Andrew Weiler
//Date -
//Class - 
//Lab  -

import java.util.Scanner;

import static java.lang.System.*;

public class Average {
	private String line;
	public int[] numCount;

	public Average() {
		line = "";
	}

	public Average(String a) {
		line = a;
	}

	public int findLength() {
		Scanner scan = new Scanner(line);
		int length = 0;
		while (scan.hasNext()) {
			length++;
		}
		return length;
	}
 
	private int getLowest() {
		int lowest = Integer.MAX_VALUE;
		Scanner scan = new Scanner(line);

		while (scan.hasNext()) {
			int loc = scan.nextInt();
			if (loc < lowest)
				lowest = loc;
		}
		return lowest;
	}

	public void setList(String line) {
		numCount = new int[findLength()];
		Scanner scan = new Scanner(line);
		for (int i = 0; i < numCount.length - 1; i++) {
			numCount[i] = scan.nextInt();
		}
		for (int k = 0; k < numCount.length - 1; k++) {
			if (numCount[k] == getLowest())
				numCount[k] = 0;
		}

	}

	public double getAverage() {
		double average = 0.0;
		Scanner scan = new Scanner(line);
		for (int i = 0; i < numCount.length - 1; i++) {
			average += (double) numCount[i];
		}
		average = average / (numCount.length - 1);
		return average;
	}

	public String toString() {
		String output = "";
		output += (line + " average = " + getAverage());
		return output;
	}
}
