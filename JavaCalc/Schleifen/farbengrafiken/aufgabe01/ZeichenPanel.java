package farbengrafiken.aufgabe01;

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

		g.setColor(Color.BLACK);
		g.drawRect(10, 10, 180, 180);
		g.drawLine(190, 10, 10, 190);
		g.drawLine(10, 10, 190, 190);

		// ------------- Ende zeichnen ------------
	}
}
