package arrayList;
//Name - Andrew Weiler
//Date -
//Class -
//Lab  - 

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{

	/*
	 *method getListOfFactors will return a list of 
	 *all of the factors of number - excluding number
	 */
	public static ArrayList<Integer> getListOfFactors(int number)
	{	ArrayList<Integer> list = new ArrayList<Integer>(); 
		for(int i = number-1; i>0; i--){
		if(number%i==0){
			list.add(i);
			
		}
	}
		
		//add code here
		return list;
	}
}