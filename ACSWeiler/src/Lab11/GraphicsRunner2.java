
package Lab11;

//Name Andrew Weiler
//Date -
//Class - 
//Lab  -

import javax.swing.JFrame;

public class GraphicsRunner2 extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner2()
	{
		super("Graphics Runner");
		setSize(WIDTH,HEIGHT);
						
						
						
		getContentPane().add(new RandomColoredBoxes());
				
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		GraphicsRunner2 run = new GraphicsRunner2();
		
	}
}