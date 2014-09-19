package lab08;

//Name -Andrew Weiler
//Date -
//Class -
//Lab  -

public class Word {
	private String word;
	private String back = "";

	public Word() {
		word = "";
	}

	public Word(String s) {
		word = s;

	}

	public String toString() {
		String word1 =  getFirstChar() + "\n" + getLastChar() + "\n"
				+ getBackWards() + "\n" + word;
		return word1;
	}

	public void setString(String s) {

		word = s;
	}

	public String getFirstChar() {
	
		return (word.substring(0, 1));
		 
	}

	public String getLastChar() {
		return (word.substring(word.length() - 1, word.length()));

	}

	public String getBackWards() {

		for (int i = word.length(); i > 0; i--)

			back += word.substring(i - 1, i);

		return back;
	}

	public void print() {
		System.out.println();
	}
}
