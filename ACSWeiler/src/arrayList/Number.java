package arrayList;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

public class Number
{
	private Integer number;

	public Number()
	{
	}

	public Number(int num)
	{
		number = num;
	}

	public void setNumber(int num)
	{ number = num;
	}

	public int getNumber()
	{	
		return number;
	}

	public boolean isOdd()
	{
		if(number%2==0)
		return false;
		else return true; 
	}

	public boolean isPerfect()
	{	int count = 0;
		for(int i = number-1; i>0; i--){
		if(number%i==0){
			count += i;
		}
	}
	
		
		return (number==count);
	}

	public String toString( )
	{
		return ""+number;
	}
}