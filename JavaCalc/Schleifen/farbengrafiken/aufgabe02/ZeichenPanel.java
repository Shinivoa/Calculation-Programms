package farbengrafiken.aufgabe02;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ZeichenPanel extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int hoehe = this.getHeight();
		int breite = this.getWidth();
		int x = 0;
		int y = 0;

		while (x < breite) {
			g.drawLine(x, 0, x, hoehe);
			x += 10;
		}
		while (y < hoehe) {
			g.drawLine(0, y, breite, y);
			y += 10;
		}

	}
}
