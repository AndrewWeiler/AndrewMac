package lab08;
//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

public class TwoToTen {
	private String binary;
	public int num;

	public TwoToTen() {

		int num = 0;

	}

	public TwoToTen(String bin) {

		binary = bin;
	}

	public void setTwo(String bin) {

		binary = bin;

	}

	public int getBaseTen() {
		num = Integer.parseInt(binary, 2);
		return num;
	}

	public String toString() {
		return (binary+ " == " + getBaseTen()+ "" );
	}
}