package javagraphique;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class MonBouton extends JButton implements MouseListener{
	
	public MonBouton (String nomBouton)  {
		super(nomBouton);
		addMouseListener(this);
		this.setPreferredSize(new Dimension(400, 400));
		this.setBackground(Color.blue);
	}

	public void mouseClicked(MouseEvent arg0) {
//		this.setText("Cliqué!");	
		//this.setBackground(Color.YELLOW);
	}

	public void mouseEntered(MouseEvent arg0) {
		this.setBackground(Color.red);
	}

	public void mouseExited(MouseEvent arg0) {
		this.setBackground(Color.blue);
	}

	public void mousePressed(MouseEvent arg0) {
		this.setText("Pressé!");
		this.setBackground(Color.YELLOW);
	}

	public void mouseReleased(MouseEvent arg0) {
		this.setText("Relaché!");	
		this.setBackground(Color.pink);
	}

	
	

}
