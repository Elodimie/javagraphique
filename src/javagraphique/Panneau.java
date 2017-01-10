package javagraphique;

import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class Panneau extends JPanel {
	
	
	private int num;
	
	public Panneau() {
		super();
		this.num = i;
	}
	
	
	
	private int i = 0;
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	      g.drawRect(10, 10, 50, 50);
	      Rectangle rec = new Rectangle();
	      
		
	System.out.println("Execution numéro du panneau " + num + " : " + (i++));
	}
}
