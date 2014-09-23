package lab08;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class GCD {
	private int one, two;
	public int max;

	public GCD() {
		max = 0;

}

	public GCD(int numOne, int numTwo) {
		one = numOne;
		two = numTwo;

	}

	public void setNums(int numOne, int numTwo) {
		one = numOne;
		two = numTwo;

	}

	public int getGCD() {

		for (int i = 1; i <= one; i++) {
			if ((one % i == 0) && (two % i == 0))
				max = i;

		}

		return max;
	}

	public String toString() {
		return ("The GCD of " + one + (" and " + two + (" is ") + getGCD()));
	}
}