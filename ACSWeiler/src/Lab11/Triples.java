package Lab11;

//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
 private int number;

	public Triples()
	{
		this(1);
	}

	public Triples(int num)
	{
		number = num;

	}

	public void setNum(int num)
	{
		number = num;


	}
	
	public static String findTriples(int x)
	{	String total = "";
		int max = x;
		for(int i = 1; i<=max-2;i++){
			for(int j = i+1; j<=max-1;j++){
				for(int k = j+1; k<=max;k++){
					if((i*i)+(j*j)== (k*k)){
						total += "\n" + i + " " + j + " " + " " + k;
					}
				}
			}
		}
		return total;
	}

	public String toString()
	{
		String output="";
		





		return output+"\n";
	}
}