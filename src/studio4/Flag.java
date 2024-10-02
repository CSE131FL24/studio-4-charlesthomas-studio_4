package studio4;

import java.awt.Color;
import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		// Set the window size and scale
		StdDraw.setXscale(0, 2);
		StdDraw.setYscale(1, 0);
		
		// Left blue rectangle
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.33, 0.5, 0.33, 0.3); // Center at (0.33, 0.3), width 0.33, height 0.5
		
		// Middle white rectangle
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(1.0, 0.5, 0.33, 0.3); // Center at (1.0, 0.3), width 0.33, height 0.5
		
		// Right red rectangle
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(1.67, 0.5, 0.33, 0.3); // Center at (1.67, 0.3), width 0.33, height 0.5
	}
}
