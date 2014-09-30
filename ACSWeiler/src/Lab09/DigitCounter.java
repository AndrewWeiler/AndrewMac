package Lab09;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class DigitCounter {
	private int num = 0;
	static int local;
	static int sum;

	public DigitCounter(int a) {
		num = a;
	}

	public int countDigits(int number) {
		local = number;
		sum = 0;
		while (number > 0) {
			number = number/10;;
			sum++;
		}
		return sum;
	}

	public String toString() {
		String x = new String("");

		x = (num + " contains " + countDigits(num) + " digits");
		return x;
	}
}
