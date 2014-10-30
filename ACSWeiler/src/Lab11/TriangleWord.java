package Lab11;

//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

class TriangleWord {
	private String word;

	public TriangleWord() {
		word = "";

	}

	public TriangleWord(String w) {
		word = w;

	}

	public void setWord(String w) {
		word = w;

	}

	public static String createTriangle(String input) {
		String loc = input;
		StringBuffer sb = new StringBuffer(loc);
		String output = "";
		int count = 0;
		int count2 = 1;
		if (loc.length() == 1)
			return loc;
		if (loc.length() % 2 == 1)
			for (int q = 0; q < (loc.length() / 2); q++) {
				output += " ";
			}
		else
			for (int q = 0; q < (loc.length() / 2) - 1; q++)
				output += "  ";
		for (int p = 0; p < loc.length(); p++) {
			for (int i = 0; i < (loc.length() / 2) - 1; i++) {
				output += "  ";

			}
			if (count < loc.length() - 1) {
				output += " " + loc.charAt(count) + "\n";
				count++;
			}
			for (int k = 1; k < count; k++) {
				output += "";
			}
			if (count2 < loc.length() - 1) {
				output += " " + loc.charAt(count2);
				count2++;
			}
		}
		output += sb.reverse() + loc.substring(1);

		return output;

	}
}