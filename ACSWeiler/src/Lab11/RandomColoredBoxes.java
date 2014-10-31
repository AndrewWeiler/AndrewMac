package Lab11;

//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Graphics;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import javax.swing.JPanel;

public class RandomColoredBoxes extends JPanel
{
	private Timer timer;
	private final static int SLEEP = 110;
	
	public RandomColoredBoxes()
	{		
		setBackground(Color.BLACK);
		setVisible(true);

		ActionListener paintCaller = new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				repaint();  
			}
		};
		timer = new Timer(SLEEP, paintCaller);
		timer.start();
	}	

	public void paintComponent( Graphics window )
	{
		super.paintComponent(window);
		
		window.setColor(Color.RED);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
	  	window.drawString("Graphics Lab Lab11k ", 20, 40);
	  	window.drawString("Drawing boxes with nested loops ", 20, 80);

	  	drawBoxes(window);
	}

	public void drawBoxes(Graphics window)
	{
		for(int row = 50; row<700;row+=15){
			for(int col = 100; col<500; col+=14){
				
		
					window.fillRect(row,  col,  10,  10);
					window.setColor(new Color(((int)(Math.random()*256)),((int)(Math.random()*256)),((int)(Math.random()*256))));//for loop to to across the x - getWidth() might be useful
		
			//for loop to go down the y - getHeight() might be useful
			
				//draw random colored boxes
	}
}
	}
}