package lab14;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;

public class ArrayFunHouseTwo
{
	//goingUp() will return true if all numbers
	//in numArray are in increasing order
	//[1,2,6,9,23] returns true
	//[9, 11, 13, 8]  returns false
	public static boolean goingUp(int[] numArray)
	{	int count = 0;
		for(int i = 0; i< numArray.length-1; i++){
			if(!(numArray[i]<numArray[i+1]))
				count++;
		}
		if(count>0)
			return false;
			else
		return true;
	}

	//goingDown() will return true if all numbers
	//in numArray are in decreasing order
	//[31,12,6,2,1] returns true
	//[31, 20, 10, 15, 9] returns false
	public static boolean goingDown(int[] numArray)
	{	int count = 0;
		for(int i = 0; i< numArray.length-1; i++){
			if(!(numArray[i]>numArray[i+1]))
			count++;
	}
		if(count>0)
			return false;
		else
			return true;
	}

	public void toString(int[] numArray){
		for(int i = 0; i< numArray.length-1; i++){
			System.out.println(numArray[i]);
		}
	
	}
}