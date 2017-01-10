package javagraphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculette extends JFrame {
	
	public Calculette (){

	/**CREATION DU FOND***/
	this.setSize(300, 350);
	this.setTitle ("Calculette");
	this.setLocationRelativeTo(null);
	
	JPanel fond = new JPanel();
	fond.setLayout(new BorderLayout(10, 10));
	fond.setBackground(Color.white);
	setContentPane(fond);
	
	
	/**CREATION DES BOUTONS**/
	JButton a1 = new JButton ("1");
	JButton a2 = new JButton ("2");
	JButton a3 = new JButton ("3");
	JButton a4 = new JButton ("4");
	JButton a5 = new JButton ("5");
	JButton a6 = new JButton ("6");
	JButton a7 = new JButton ("7");
	JButton a8 = new JButton ("8");
	JButton a9 = new JButton ("9");
	JButton a0 = new JButton ("0");
	JButton point = new JButton (".");
	JButton resultat = new JButton ("=");
	
	JButton b1 = new JButton ("C");
	JButton b2 = new JButton ("+");
	JButton b3 = new JButton ("-");
	JButton b4 = new JButton ("*");
	JButton b5 = new JButton ("/");
	
	
	
	JLabel text1 = new JLabel("Ecran") ;
	text1.setForeground(Color.white);
	//text1.setHorizontalAlignment();
		
	/**CREATION DES DIFFERENTS PANNEAUX*/
	
	JPanel texte = new JPanel();
	texte.add(text1);
	texte.setBackground(Color.DARK_GRAY);
	texte.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	
	JPanel chiffres = new JPanel ();
	chiffres.setLayout(new GridLayout(4,3));
	chiffres.add(a1);
	chiffres.add(a2);
	chiffres.add(a3);
	chiffres.add(a4);
	chiffres.add(a5);
	chiffres.add(a6);
	chiffres.add(a7);
	chiffres.add(a8);
	chiffres.add(a9);
	chiffres.add(a0);
	chiffres.add(point);
	chiffres.add(resultat);

	JPanel calculs = new JPanel ();
	calculs.setLayout(new GridLayout(5,1));
	calculs.setSize(new Dimension (100, 250));
	calculs.add(b1);
	calculs.add(b2);
	calculs.add(b3);
	calculs.add(b4);
	calculs.add(b5);

	fond.add(texte, BorderLayout.PAGE_START);
	fond.add(chiffres, BorderLayout.CENTER);
	fond.add(calculs, BorderLayout.EAST);
	
	this.setVisible(true);
	
  } 

	
	
	
	
	
}
