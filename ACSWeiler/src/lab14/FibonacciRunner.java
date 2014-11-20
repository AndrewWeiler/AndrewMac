package lab14;
//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

public class FibonacciRunner
{
	public static void main(String args[])
	{
		Fibonacci test = new Fibonacci(11);
		test.set(11);
		System.out.println(test);
		
		Fibonacci test2 = new Fibonacci(21);
		test.set(21);
		System.out.println(test2);
	}
}