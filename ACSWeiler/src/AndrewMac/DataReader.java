package AndrewMac;

import static java.lang.System.out;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;
public class DataReader {
	

	public DataReader() {
		
	}
	
	public String returnData(String data) throws IOException{
		
		String result = "";
		Scanner file = new Scanner(new File(data));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i < size; i++)
		{
		   String num = file.nextLine();

			 result += num;
			
		}
		 return result;

	}
}