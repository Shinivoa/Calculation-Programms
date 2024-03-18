package farbengrafiken.Koordinatensyteme;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

import Tools.IOTools;

public class ZeichenPanel extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		final int strich = 5;
		final int strichGros = 10;
		final int strichlenght = 3;
		final int strichlenghtgross = 5;
		int hoehe = this.getHeight();
		int breite = this.getWidth();
		int b_halbe = breite / 2;
		int h_halbe = hoehe / 2;

		g.setColor(Color.BLACK);
		// x achse
		g.drawLine(0, h_halbe, breite, h_halbe);
		// y achse
		g.drawLine(b_halbe, 0, b_halbe, hoehe);

		g.setColor(Color.BLUE);
		for (int i = strich; i <= b_halbe; i = i + strich) {
			if (i % strichGros == 0) {
				// negativer
				g.drawLine(b_halbe - i, h_halbe - strichlenghtgross, b_halbe - i, h_halbe + strichlenghtgross);
				// positiver
				g.drawLine(b_halbe + i, h_halbe - strichlenghtgross, b_halbe + i, h_halbe + strichlenghtgross);

			} else {
				// negativer
				g.drawLine(b_halbe - i, h_halbe - strichlenght, b_halbe - i, h_halbe + strichlenght);
				// positiver
				g.drawLine(b_halbe + i, h_halbe - strichlenght, b_halbe + i, h_halbe + strichlenght);
			}

		}

		for (int i = 0; i <= hoehe / 2; i = i + strich) {
			if (i % strichGros == 0) {
				g.drawLine(b_halbe + strichlenghtgross, h_halbe - i, b_halbe - strichlenghtgross,
						h_halbe - i);
				g.drawLine(b_halbe + strichlenghtgross, h_halbe + i, b_halbe - strichlenghtgross,
						h_halbe + i);
			} else {
				g.drawLine(b_halbe + strichlenght, h_halbe - i, b_halbe - strichlenght, h_halbe - i);
				g.drawLine(b_halbe + strichlenght, h_halbe + i, b_halbe - strichlenght, h_halbe + i);
			}

		}

		double x = IOTools.readDouble("x =");
		double y = IOTools.readDouble("y =");

		for (int i = 0; i <= breite; i++) {
			x = (i - breite / 2) * 1.0 / 10;
			y = 2 * x;
		}

		System.out.println("x =" + x + " y =" + y);

	}

}
