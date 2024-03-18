package farbengrafiken.aufgabe06;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ZeichenPanel extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int hoehe = this.getHeight();
		int breite = this.getWidth();

		for (int x = 0; x < 2137; x = x + 21) {
			g.drawRect(x, x, x, x);
		}

	}
}
