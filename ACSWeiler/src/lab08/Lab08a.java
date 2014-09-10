package lab08;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;

public class Lab08a extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public Lab08a()
	{
		super("Graphics Runner");
		setSize(WIDTH,HEIGHT);
						
		getContentPane().add(new ForLoopCircles());
				
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		Lab08a run = new Lab08a();
	}
}