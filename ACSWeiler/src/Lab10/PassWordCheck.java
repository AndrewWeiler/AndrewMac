package Lab10;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
	private String password;
	public String y = "";
	public String x = "";
	public PasswordCheck()
	{
	y = "";	
	x = "password";


	}

	public void check()
	{
		Scanner keyboard = new Scanner(System.in);
		do{
			out.print("Enter a phrase:" );
			y = keyboard.nextLine();
			if (!(y.equals(x)))
			{out.println("INVALID");}
			} while(!(y.equals(x)));
		out.println("VALID");
	

	}
}