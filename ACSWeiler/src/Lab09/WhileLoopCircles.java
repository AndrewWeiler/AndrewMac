package Lab09;


//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

public class WhileLoopCircles extends Canvas
{
	public WhileLoopCircles()
	{
		setBackground(Color.WHITE);
	}
	
	public void paint( Graphics window )
	{
		window.setColor(Color.white);
		window.fillRect(0,0,640,480);
		
		window.setColor(Color.red);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
		
		window.drawString("Lab 9A", 20, 40 );
	  	window.drawString("Drawing Circles Using a while loop ", 20, 80 );
	  	drawCircles(window);
	}
	
	public void drawCircles(Graphics window)
	{
		int x = 95;
		int y = 95;                                                                            
   while ((x<200)&&(y<200))
   { 	
  	window.setColor(Color.blue);
			//drawOval(int x1, it y1, int width, int height)
			window.drawOval( x, y, x/2, y/2 );
			 x = x+10;
		       y = y+10;
   }
	}	
}