package lab14;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import java.util.Arrays;

public class ArrayFunHouseRunnerTwo
{
	public static void main( String args[] )
	{
		int[] one = {1,2,3,4,5,6,7,8,9,10};

		System.out.println(Arrays.toString(one));
		System.out.println("Is going up? " + ArrayFunHouseTwo.goingUp(one));
		
		int[] two = {9, 8, 7, 6, 5, 4, 3, 2, 0, -2};

		System.out.println(Arrays.toString(two));
		System.out.println("Is going up? " + ArrayFunHouseTwo.goingUp(two));
		
		
		

	}
}