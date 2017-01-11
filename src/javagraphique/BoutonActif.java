package javagraphique;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BoutonActif extends JButton implements ActionListener {

	public BoutonActif (){
		addActionListener(this);
		this.setText("Désactivé");
		this.setVisible(true);
	}
	

	public void actionPerformed(ActionEvent e) {
		if (this.getText().equals("ACTIVE")) 
		{
			this.setText("DESACTIVE");
		}
		else this.setText("ACTIVE");
		
	}

   
}