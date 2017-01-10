package javagraphique;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

	public class Exo3 extends JFrame {
		
		public Exo3 (){
			this.setSize(500, 500);
			this.setLocationRelativeTo(null);
			this.setBackground(Color.darkGray);
			Panneau panneaud = new Panneau();
			
			
			this.setContentPane(panneaud);
			this.setVisible(true);
}

		public class Panneau extends JPanel {
			private int i = 0;
			public void paintComponent(Graphics g) {
			System.out.println("Execution numéro : " + (i++));
			}
			
			
		}	
}
