package lab14;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Arrays;

public class ArrayFunHouse
{	
	public static int getSum(int[] numArray, int start, int stop)
	{	int sum = 0;
		int[] locArray = numArray;
			for(int i = start; i<=stop; i++){
				sum+=locArray[i];
		}
		
		return sum;
	}

	
	//getCount() will return number of times val is present
	public static int getCount(int[] numArray, int val)
	{	int count = 0;
		int[] locArray = numArray;
			for(int i = 0; i<locArray.length; i++){
				if(locArray[i]==val)
				count++;
			}
		return count;
	}

	
	public static int[] removeVal(int[] numArray, int val)
	{	int[] locArray = new int[numArray.length-(getCount(numArray, val))];
		int count = 0;
		int val2 = val;
		for(int item: numArray)
		{
			if(item != val)
			{
				locArray[count++] = item;
				System.out.println(locArray[item]);
			}
		}
		/*for(int i = 0; i<numArray.length-1; i++){
			
			if(numArray[i]!=val2){
				locArray[count] = numArray[i];
				
				count++;
				System.out.println(locArray[i]);
			}
		}*/
		
		return locArray;
	}
}