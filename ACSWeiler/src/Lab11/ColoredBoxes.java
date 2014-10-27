package Lab11;

//Name - Andrew Weiler
//Date -
//Class - 
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

class ColoredBoxes extends Canvas
{
	public ColoredBoxes()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.RED);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
	  	window.drawString("Graphics Lab Lab11g ", 20, 40 );
	  	window.drawString("Drawing boxes with nested loops ", 20, 80 );

	  	drawBoxes(window);
	}

	public void drawBoxes(Graphics window)
	{
		for(int i = 0; i<4;i++)
			for(int j = 0; j<4; j++)
			   window.setColor(Color.blue);
				window.drawBox())
		
		//nested loops to draw the pretty boxes







	}
}