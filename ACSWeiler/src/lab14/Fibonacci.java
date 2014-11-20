package lab14;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -
import java.util.Arrays;

public class Fibonacci {
	public int num = 0;// instance variable
	public int[] list;

	public Fibonacci(int a) {
		num = a;
		

	}

	public void set(int a) {
		int loc = a;
		list = new int[a];
		list[0] = 1;
		list[1] = 1;
		for (int i = 2; i < loc; i++) {
			list[i] = list[i - 1] + list[i - 2];
		}
		
	}

	public long findFib() {
		long fib = 0;
		set(num);
	fib = list[num-1];
		return fib;

	}

	public String toString() {
		String output = "";
		output += ("With a limit of " + num + " the final Fibonacci number is :: " + findFib() + "\n");
		return output;
	}
}