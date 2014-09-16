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

	public void setString(String s) {

		word = s;
	}

	public void getFirstChar() {
		System.out.println(word.substring(0, 1));
		
	}

	public void getLastChar() {
		System.out.println(word.substring(word.length() - 1, word.length()));
		 
		
	}

	public void getBackWards() {

		for (int i = word.length(); i > 0; i--)
			
			back += word.substring(i - 1,i );
			
			
		System.out.println(back);
	}

	public void print() {
		System.out.println();
	}
}
