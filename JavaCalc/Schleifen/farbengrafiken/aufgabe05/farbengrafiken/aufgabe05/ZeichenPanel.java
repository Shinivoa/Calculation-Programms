package farbengrafiken.aufgabe05;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ZeichenPanel extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int hoehe = this.getHeight();
		int breite = this.getWidth();

		g.setColor(Color.RED);

		for (int x = 0; x < 2137; x = x + 10) {
			g.drawOval(x, x, x, x);
		}
	}
}
