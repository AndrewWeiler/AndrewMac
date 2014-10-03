package Lab09;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class LetterRemover {
	private String sentence;
	private String lookFor;

	public LetterRemover(String phrase, String delete) {
		sentence = phrase;
		lookFor = delete;
	}

	public void setRemover(String s, String rem) {
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters() {
		String cleaned = sentence;
		int loc = sentence.indexOf(lookFor);
		while (loc > 0) {
			cleaned = cleaned.substring(0, loc) + cleaned.substring(loc + 1);
			loc = cleaned.indexOf(lookFor);

		}

		return cleaned;
	}

	public String toString() {
		return (sentence + " - letter to remove " + lookFor + "\n" + removeLetters());
	}
}