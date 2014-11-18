package lab14;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import java.util.Scanner;

public class OddsAndEvens {
	public static int evenCount(int[] array) {
		int evenCount = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] % 2 == 0)
				evenCount++;
		}
		return evenCount;
	}

	public static int oddCount(int[] array) {
		int oddCount = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] % 2 == 1)
				oddCount++;
		}
		return oddCount;
	}

	public static int[] getEvens(int[] array)
	{  int [] locEven = new int [evenCount(array)];
		int count = 0;
		for(int i = 0;i<array.length-1; i++){
		if(array[i]%2==0)
			locEven[count] = array[i];
			count++;
	}
		return locEven;
	}

	public static int[] getOdds(int[] array) {
		{  int [] locOdd = new int [oddCount(array)];
		int count = 0;
		for(int k = 0;k<array.length-1; k++){
		if(array[k]%2==1)
			System.out.println(array[k]);
		System.out.println(k);
			locOdd[count] = array[k];
			count++;
	}
		return locOdd;
	}

}
}