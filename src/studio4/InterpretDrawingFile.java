package studio4;

import java.awt.Color;
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
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapetype = in.next();
		int redcompnent = in.nextInt();
		int greenCompnent = in.nextInt();
		int blueCompnent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		
		//StdDraw.filledshapetype(parameterOne,parameterTwo,parameterThree);
		if (shapetype.equals("rectangle")) {
			Color flagC = new Color(redcompnent,greenCompnent,blueCompnent);
			StdDraw.setPenColor(flagC);
			StdDraw.filledRectangle(parameterOne,parameterOne,parameterTwo,parameterThree);
		}
		
		
	}
}
