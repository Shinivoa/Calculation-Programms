package farbengrafiken.aufgabe07;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ZeichenPanel extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int hoehe = this.getHeight();
		int breite = this.getWidth();

		g.setColor(Color.BLACK);
		for (int x1 = 0; x1 <= breite; x1 += 10) {
			g.drawLine(x1, 0, breite, breite - x1);
		}
		g.setColor(Color.RED);
		for (int x2 = 10; x2 <= hoehe; x2 = x2 + 10) {
			g.drawLine(0, x2, hoehe - x2, hoehe);
		}
	}
}
