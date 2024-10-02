package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); // making Scanner with a File

		String shapetype = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean isfilled = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		StdDraw.setPenColor(red, green, blue);
		if (shapetype.equals("rectangle")) {
			double height = in.nextDouble();
			double width = in.nextDouble();
			if (isfilled == true) {
				StdDraw.filledRectangle(x, y, width, height);
			} else {
				StdDraw.rectangle(x, y, width, height);
			}
		}
		
		
		
	}
}
