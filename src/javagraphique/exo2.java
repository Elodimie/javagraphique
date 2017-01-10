package javagraphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class exo2 extends JFrame {
	
		
		public exo2 (){
			this.setSize(500, 500);
			this.setTitle ("Ma première fenêtre JAVA");
			this.setLocationRelativeTo(null);
			
			
			JPanel panneauN = new JPanel();
			panneauN.setBackground(Color.pink);
			
			setContentPane(panneauN);
			
			JButton hu = new JButton ("1");
			JButton ho = new JButton ("2");
			JButton he = new JButton ("3");
			JButton hy = new JButton ("4");

			JPanel aa = new JPanel ();//flowL
			
			JPanel ab = new JPanel ();
			ab.add(hu);
			JPanel ac = new JPanel ();
			
			ac.add(ho);
			JPanel ad = new JPanel ();
			JPanel ba = new JPanel ();
			
			ad.setLayout(new GridLayout(2,3));
			ad.add(new JButton("1"));
			ad.add(new JButton("2"));
			ad.add(new JButton("3"));
			ad.add(new JButton("4"));
			ad.add(new JButton ("yes!"));
			
			aa.setBackground(Color.blue);
			panneauN.add(aa);
		
			aa.add(ab);
			aa.add(ac);
			aa.add(ad);
			aa.setLayout(new BoxLayout(aa, BoxLayout.PAGE_AXIS));
		
			
//			panneauN.setLayout(new BoxLayout(panneauN, BoxLayout.LINE_AXIS));
//			panneauN.add(hu);
//			panneauN.add(he);
//			panneauN.add(ho);
			
			
//			panneauN.setLayout(new GridLayout(3,2));
//			setContentPane(panneauN);
//			panneauN.add(new JButton("1"));
//			panneauN.add(new JButton("2"));
//			panneauN.add(new JButton("3"));
//			panneauN.add(new JButton("4"));
//			panneauN.add(new JButton("5"));
			
//			JButton nord = new JButton();
//			nord.setText("NORD");
//			nord.setVisible(true);	
//			JButton ouest = new JButton("Ouest");
//			JButton est = new JButton("Est");
//			est.setPreferredSize(ouest.getPreferredSize());
//			JButton sud = new JButton("Sud");
//			JButton center = new JButton("Centro");
//			panneauN.setLayout(new BorderLayout());
//			panneauN.add(nord, BorderLayout.NORTH);
//			panneauN.add(ouest, BorderLayout.WEST);
//			panneauN.add(center, BorderLayout.CENTER);
//			panneauN.add(est, BorderLayout.EAST);
//			panneauN.add(sud, BorderLayout.SOUTH);
//			nord.setBackground (Color.green);
//			panneauN.setVisible(true);
		
			
//			this.setVisible(true);	
//			nord.setPreferredSize(new Dimension(5,ouest.getWidth()));
			this.setVisible(true);
			
		  } 
}
		