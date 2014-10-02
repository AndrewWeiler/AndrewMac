package Lab09;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class DigitMath {
	int i = 0;
	double sum = 0;
	double avg = 0;

	public DigitMath(int number) {
		i = number;

	}

	public static int sumDigits(int number) {
		int sum = 0;
		return sum;
	}

	public double findAvg() {
		double sum = 0;
		double avg = 0;
		int x = i;
		double count = 0;
		while (x > 0) {
			sum += x % 10;
			x = x / 10;
			count++;
		}

		avg = sum / count;
		return avg;

	}

	public String toString() {
		String print = "";
		print = (i + " has the average of " + findAvg());
		return print;
	}
}