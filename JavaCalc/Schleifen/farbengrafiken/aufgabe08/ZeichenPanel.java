package farbengrafiken.aufgabe08;

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

		g.setFont(new Font("Serif", Font.BOLD, 30));

		g.setColor(Color.BLACK);

	}
}
