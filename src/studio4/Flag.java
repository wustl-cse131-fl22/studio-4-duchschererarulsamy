package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledRectangle(0.5,0.5,.5,0.4);
		StdDraw.setPenColor(255,255,255);
		StdDraw.filledRectangle(0.5,0.5,0.45,0.35);
		StdDraw.setPenColor(62,163,240);
		StdDraw.filledCircle(.5, .5, .15);
	}
}