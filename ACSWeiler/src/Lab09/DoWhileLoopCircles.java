package Lab09;

//Name - Andrew Weiler
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;

public class DoWhileLoopCircles extends Canvas {
	public DoWhileLoopCircles() {
		setBackground(Color.WHITE);
	}

	public void paint(Graphics window) {
		window.setColor(Color.WHITE);
		window.fillRect(0, 0, 640, 480);

		window.setColor(Color.red);
		window.setFont(new Font("TAHOMA", Font.BOLD, 12));

		window.drawString("Lab 9B", 20, 40);
		window.drawString("Drawing Circles Using a do while loop ", 20, 80);
		drawCircles(window);
	}

	public void drawCircles(Graphics window) {
		int x =350;
		int y =95;   
	 
		while ((x > 100) && (y < 150 )) {
			window.setColor(Color.blue);

			window.drawOval(x, y, x / 2, y / 2);
			x = x - 10;
			y = y + 5;
		}
	}
}