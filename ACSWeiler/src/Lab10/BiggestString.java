package Lab10;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class BiggestString
{
	private String one,two,three;

	public BiggestString()
	{
		this("","","");
	}

	public BiggestString(String a, String b, String c)
	{
		 one = a;
		 two = b;
		 three = c;
	}

	public void setStrings(String a, String b, String c)
	{
		 one = a;
		 two = b;
		 three = c;
	}

	public String getBiggest()
	{ String max = "";
	if(one.compareTo(two) > 0 && one.compareTo(three)>0)
	 max = one;
	if(two.compareTo(one) > 0 && two.compareTo(three)>0)
		 max = two;
	if(three.compareTo(two) > 0 && three.compareTo(one)>0)
		 max = one;
		
	return max;
	}

	public String toString()
	{
	   return (one +" " +two +" " +three +"\n"+ "biggest = " + getBiggest());
	}
}