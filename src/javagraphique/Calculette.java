package javagraphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculette extends JFrame {
	String ecran = "ecran";
	JLabel text1 = new JLabel(ecran) ;
	JButton point = new JButton (".");
	JButton resultat = new JButton ("=");
	JButton numero = new JButton();
	JPanel chiffres = new JPanel ();
	String numberButtonAction [] = {"1","2", "3"," 4" , "5"," 6" , "7" , "8", "9", "0"};


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


		chiffres.setLayout(new GridLayout(4,3));

		String numberButtonAction [] = {"1","2", "3"," 4" , "5"," 6" , "7" , "8", "9", "0"};
		for ( int i = 0; i < 10; i++) {
			numero = new JButton(numberButtonAction[i]);
			chiffres.add(numero);
			numero.addActionListener(new ChiffreListener());
		}


		text1.setForeground(Color.white);



		JButton b1 = new JButton ("C");
		JButton b2 = new JButton ("+");
		JButton b3 = new JButton ("-");
		JButton b4 = new JButton ("*");
		JButton b5 = new JButton ("/");



		/**CREATION DES DIFFERENTS PANNEAUX*/

		JPanel texte = new JPanel();
		texte.add(text1);
		texte.setBackground(Color.DARK_GRAY);
		texte.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));



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
	
	class ChiffreListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (!text1.getText().equals("0.0")) 
			{
				text1.setText(text1.getText() + numberButtonAction);
			} else 
			{
				text1.setText("");
				actionPerformed(e);
			}
		}
	}

}
