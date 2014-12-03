package AndrewMac;

import static java.lang.System.out;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

import lab13.Social;

public class DataReader {

	public DataReader() {

	}

	public String returnData(String data) throws IOException {
		String result = "";
		int count = 0;
		Scanner file = new Scanner(new File(data));
		while(file.hasNext()) {
			
			String num = file.nextLine();
			
			result += num + " ";
			
		}
		return result;

	}
}