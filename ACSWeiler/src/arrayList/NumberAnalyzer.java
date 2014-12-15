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
	public NumberAnalyzer()
	{
		
	}

	public NumberAnalyzer(String numbers)
	{
	list = new ArrayList<Number>();
	}
	
	public void setList(String numbers)
	{	Scanner scan = new Scanner(System.in);
		list.add(new Number(scan.nextInt()));
	}

	public int countOdds()
	{  int oddCount=0;
	for(int i = 0; i<list.size(); i++){
		if(!(i%2==0))
			oddCount++;
	}


    return oddCount;
	}

	public int countEvens()
	{
    int evenCount=0;
    for(int i = 0; i<list.size(); i++){
		if((i%2==0))
			evenCount++;
	}

    return evenCount;
	}

	public int countPerfects()
	{	int perfectCount = 0;
		int count = 0;
	for(int i = 0; i<list.size(); i++){
		if((i%2==0))
			{
				count += i;
		}
		if (number==count);
		perfectCount++;
	}


	return perfectCount;
}
	
	public String toString( )
	{
		return (list + "\n" + "Even count = " + countEvens() + "\n" + "Odd count = " + countOdds());
	}
}