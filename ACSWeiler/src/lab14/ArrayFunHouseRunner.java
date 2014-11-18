package lab14;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import java.util.Arrays;

public class ArrayFunHouseRunner
{
	public static void main( String args[] )
	{
		int[] one = {7, 4, 10, 0, 1, 7, 6, 5, 3, 2, 9, 7};

		System.out.println(Arrays.toString(one));
		System.out.println("sum of spots 3-6  =  " + ArrayFunHouse.getSum(one,3,6));
		System.out.println("sum of spots 2-9  =  " + ArrayFunHouse.getSum(one,2,9));
		System.out.println("# of 4s  =  " + ArrayFunHouse.getCount(one,4));
		System.out.println("# of 9s  =  " + ArrayFunHouse.getCount(one,9));
		System.out.println("# of 7s  =  " + ArrayFunHouse.getCount(one,7));
		System.out.println("new array with all 7s removed   =  " + ArrayFunHouse.removeVal(one,7));
		
		
		//int[] two = {4,2,3,4,6,7,8,9,0,10,0,1,7,6,5,3,2,9,9,8,7};

		//System.out.println(Arrays.toString(two));
		//System.out.println("sum of spots 3-6  =  " + ArrayFunHouse.getSum(two,3,6));
		//System.out.println("sum of spots 2-9  =  " + ArrayFunHouse.getSum(two,2,9));
		//System.out.println("# of 4s  =  " + ArrayFunHouse.getCount(two,4));
		//System.out.println("# of 9s  =  " + ArrayFunHouse.getCount(two,9));

		//add test cases


	}
}