package farbengrafiken.aufgabe09;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ZeichenPanel extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int hoehe = this.getHeight();
		int breite = this.getWidth();

		g.setFont(new Font("Serif", Font.BOLD, 15));

		g.setColor(Color.BLACK);
		int spalte = 10, zeile = 20, aspalte = 20, azeile = 20;
		for (int i = 65; i < 90; i++) {
			g.drawString("" + (char) i, spalte, zeile);
			spalte += aspalte;
			if (spalte > (breite - aspalte)) {
				spalte = 10;
				zeile += azeile;
			}
		}

	}
}
