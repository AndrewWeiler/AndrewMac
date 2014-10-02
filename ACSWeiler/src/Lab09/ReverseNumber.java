package Lab09;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class ReverseNumber {
	public int number;
	public int loc;

	public ReverseNumber(int a) {
		loc = a;

	}

	public int setNum(int num) {
		int number = 0;
		return number;
	}

	public int getReverse() {
		int rev = 0;
		int number = loc;

		while (number > 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;

		}
		return rev;
	}

	public String toString() {
		String print = new String("");
		print = (loc + " reversed is " + getReverse());
		return print;
	}

}