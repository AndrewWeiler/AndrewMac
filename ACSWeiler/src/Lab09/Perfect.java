package Lab09;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Perfect {
	public int number;
	public int y;
	public Perfect(int a) {
		number = a;

	}

	public int setNum(int a) {
		number = 0;
		return number;
	}

	public int sumOfDivisors(int a){
		int  y  = 1;
		number = a;
		int divisors = 0;
		
		while(y<number)
		 {if(number%y==0)
		divisors += y;
		y++;
	}return divisors;
		
	}

	public boolean isPerfect() {
		if (number == sumOfDivisors(number))
			return true;
		else
			return false;
	}

	public String toString() {
		String print = "";
		if (isPerfect() == true)
			print = (number + " is perfect");
		else
			print = (number + " is not perfect");
		return print;
	}
}