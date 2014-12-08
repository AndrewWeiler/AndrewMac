package arrayList;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;

public class NumberAnalyzer
{
	private ArrayList<Number> list;
	private Integer number;
	public NumberAnalyzer()
	{

	}

	public NumberAnalyzer(String numbers)
	{
	
	}
	
	public void setList(String numbers)
	{


	
	}

	public int countOdds()
	{  int oddCount=0;
		if(!(number%2==0))
			oddCount++;



    return oddCount;
	}

	public int countEvens()
	{
    int evenCount=0;
    	if(number%2==0)
    	evenCount++;

    return evenCount;
	}

	public int countPerfects()
	{	int perfectCount = 0;
		int count = 0;
	for(int i = number-1; i>0; i--){
		if(number%i==0){
				count += i;
		}
		if (number==count);
		perfectCount++;
	}


	return perfectCount;
}
	
	public String toString( )
	{
		return "";
	}
}