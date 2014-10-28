package Lab11;

//Name Andrew Weiler
//Date -
//Class - 
//Lab  -

//Name Andrew Weiler
//Date -
//Class - 
//Lab  -

import javax.swing.JFrame;

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("Graphics Runner");
		setSize(WIDTH,HEIGHT);
						
		getContentPane().add(new ColoredBoxes());					
						
		//getContentPane().add(new RandomColoredBoxes());
				
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
		
	}
}