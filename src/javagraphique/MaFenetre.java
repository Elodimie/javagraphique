package javagraphique;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class MaFenetre extends JFrame implements MouseListener {

	public MaFenetre (){
		super("Une fenêtre qui traite les clics souris");
		setSize (300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		addMouseListener(this);
		
	}
	
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		
		System.out.println("clic dans la fenêtre au point de coordonnées " + x + ", " + y);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
}

//Créez une fenêtre qui contient un bouton avec un fond bleu. Le
//fond deviend rouge quand on passe la souris sur le bouton et
//redevient bleu quand on n’est plus dessus. Le bouton affichera le
//mot "Pressé !" lorsque l’on clique dessus et affichera "Relâché !"
//lorsque l’on relâche le clic de la souris. Enfin, le fond deviendra
//jaune quand on clique sur le bouton.
//Pour cet exercice vous devez créer votre propre bouton, c’est-à-dire
//une nouvelle classe dérivant de la classe Button.
