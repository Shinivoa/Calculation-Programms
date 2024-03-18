package farbengrafiken.aufgabe03;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ZeichenPanel extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int hoehe = this.getHeight();
		int breite = this.getWidth();
		// ----------- Hier zeichnen --------------
		g.setColor(Color.BLUE);
		int d = 10;
		int x = 0;

		while (x < breite) {
			g.drawLine(x, 0, breite - x, hoehe);
			x = x + d;
		}
		int y = 0;
		g.setColor(Color.RED);
		while (y < hoehe) {
			g.drawLine(0, y, breite, hoehe - y);
			y = y + d;
		}

		// ------------- Ende zeichnen ------------
	}
}
