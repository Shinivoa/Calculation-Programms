package farbengrafiken.aufgabe01;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Zeichenfenster extends JFrame {
	JPanel panel;

	public Zeichenfenster() {
		panel = new ZeichenPanel();
		panel.setPreferredSize(new Dimension(200, 200));
		this.add(panel);
	}

	public static void main(String[] args) {
		Zeichenfenster zf = new Zeichenfenster();
		zf.setTitle("Zeichenfenster");
		zf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		zf.pack();
		zf.setVisible(true);
	}

}
