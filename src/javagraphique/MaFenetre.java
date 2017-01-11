package javagraphique;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MaFenetre extends JFrame implements MouseListener {

	public MaFenetre (){
		super("La jolie fen�tre");
		setSize (500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel t = new JPanel();
		this.setContentPane(t);
		t.setSize(400,400);
		
		MonBouton bouton1 = new MonBouton("COUCOU");
		
		t.add(bouton1);
		
		bouton1.setVisible(true);
		setVisible(true);
		
		addMouseListener(this);
		
	}
	
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("clic dans la fen�tre au point de coordonn�es " + x + ", " + y);
		
	}
	
	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
}

//Cr�ez une fen�tre qui contient un bouton avec un fond bleu. Le
//fond deviend rouge quand on passe la souris sur le bouton et
//redevient bleu quand on n�est plus dessus. Le bouton affichera le
//mot "Press� !" lorsque l�on clique dessus et affichera "Rel�ch� !"
//lorsque l�on rel�che le clic de la souris. Enfin, le fond deviendra
//jaune quand on clique sur le bouton.
//Pour cet exercice vous devez cr�er votre propre bouton, c�est-�-dire
//une nouvelle classe d�rivant de la classe Button.
