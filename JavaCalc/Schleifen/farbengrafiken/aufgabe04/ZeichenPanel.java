package farbengrafiken.aufgabe04;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ZeichenPanel extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int hoehe = this.getHeight();
		int breite = this.getWidth();
		int rot, gruen, blau;
		int x1, y1, x2, y2;

		for (int i = 0; i < 2137; i++) {
			rot = (int) (Math.random() * 256);
			gruen = (int) (Math.random() * 256);
			blau = (int) (Math.random() * 256);
			g.setColor(new Color(rot, gruen, blau));

			x1 = (int) (Math.random() * breite);
			x2 = (int) (Math.random() * breite);
			y1 = (int) (Math.random() * hoehe);
			y2 = (int) (Math.random() * hoehe);
			g.drawLine(x1, y1, x2, y2);

		}

		// ------------- Ende zeichnen ------------
	}
}
