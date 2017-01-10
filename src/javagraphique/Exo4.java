package javagraphique;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;

public class Exo4 {

	public Exo4(){
	Fenetre fen = new Fenetre ();
	
	Panneau pan0 = new Panneau ();
	
	fen.setContentPane (pan0);
	pan0.setLayout(null);
	pan0.setPreferredSize(new Dimension(500, 500));
	
	JButton hd = new JButton ();
	JButton hg = new JButton ("nom1");
	JButton bd = new JButton ("nom2");
	JButton bg = new JButton ("nom3");

	hd.setBounds(0, 50, 100, 100);
	//hd.setLocation(0, (pan0.getHeight())/2);
	hg.setLocation(0, 0);
	bd.setLocation((pan0.getWidth())/2, 0);
	bg.setLocation((pan0.getWidth())/2, (pan0.getHeight())/2);
	//hd.setPreferredSize(new Dimension((pan0.getWidth())/2,(pan0.getHeight())/2));
	
	pan0.add(hd);
	pan0.add(hg);
	pan0.add(bg);
	pan0.add(bd);
	
	System.out.println("larg :"+pan0.getWidth()/2 +" long : " + pan0.getHeight()/2);
	
	
//	
	pan0.setVisible(true);
	
	
	}
	
	
}
//Afficher dans un panneau, un triangle vert en haut à gauche, un
//carré bleu en haut à droite, un rond remplie en jaune en bas à
//gauche et en bas à droite le logo de l’IMIE.
