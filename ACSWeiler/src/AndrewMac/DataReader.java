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

	public String createLength(String data) throws IOException {
		String count = "";
		Scanner file = new Scanner(new File(data));
		while (file.hasNext()) {
			count += "2" + " ";

		}
		return count;
	}

	public int addData(String data) throws IOException {

		int count2 = 0;
		Scanner file = new Scanner(new File(data));
		while (file.hasNext()) {
			count2 += 2;

		}
		return count2;
	}

	public String returnData(String data) throws IOException {
		String result = "";
		int count = 0;
		Scanner file = new Scanner(new File(data));

		file.nextLine();
		for (int i = 0; i < addData(data); i++) {
			String num = file.nextLine();
		/*	if (count >= 2) {
				result += num + "\n";
				count = 0;
			} else*/
				result += num;
			count++;
		}
		return result;

	}
}