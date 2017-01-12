package javagraphique;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class JMenuBar1 extends JFrame implements MouseListener{


	public JMenuBar1() {
		this.setTitle("Fenêtre de choix couleurs");
		this.setSize(500,500);
		this.setVisible(true);
		this.addMouseListener(this);
		
		
		
		JMenuBar barresmenu = new JMenuBar();
		setJMenuBar(barresmenu);


		JMenu couleur = new JMenu ("couleur");
		barresmenu.add(couleur);
		JMenuItem rouge = new JMenuItem ("rouge");
		couleur.add(rouge);
		couleur.addSeparator();
		rouge.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.red);
			}
		}
				);
		JMenuItem noir = new JMenuItem ("noir");
		couleur.add(noir);
		couleur.addSeparator();
		noir.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.black);
			}
		}
				);
		JMenuItem rose = new JMenuItem ("rose");
		couleur.add(rose);
		rose.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.pink);
			}
		}
				);


		JMenu alternative = new JMenu ("alternatives");
		barresmenu.add(alternative);
		JRadioButtonMenuItem t = new JRadioButtonMenuItem ("rouge");
		alternative.add(t);
		alternative.addSeparator();
		JRadioButtonMenuItem w = new JRadioButtonMenuItem ("vert");
		alternative.add(w);
		alternative.addSeparator();
		ButtonGroup groupe = new ButtonGroup();
		groupe.add(w);
		groupe.add(t);

		t.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.red);
			}
		}
				);
		w.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.green);
			}
		}
				);


		JMenu trois = new JMenu ("troisième menu");
		barresmenu.add(trois);
		JCheckBoxMenuItem r = new JCheckBoxMenuItem ("rouge");
		trois.add(r);
		trois.addSeparator();
		JCheckBoxMenuItem s = new JCheckBoxMenuItem ("vert");
		trois.add(s);

		r.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				if(r.isSelected()){
					JLabel u = new JLabel("ROUGE ROUGE ROUGE");
					u.setForeground(Color.red);
					System.out.println("ok");
					getContentPane().add(u);
					validate();
				}
			}
		});
		s.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.green);
			}
		}
				);

	
		
	
	JToolBar tools = new JToolBar();


	JButton first = new JButton("enregistrer");
	JButton second = new JButton("effacer");
	JButton raccourci = new JButton ("rose raccourci");
	//second.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK + KeyEvent.SHIFT_DOWN_MASK));
	second.setToolTipText("HELP : ceci effacera votre travail !");

	raccourci.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
			rose.doClick();  	
		}
    });
   
   
	getContentPane().add(tools);
	tools.add(first);
	tools.add(second);
	tools.add(raccourci);
	
 
	
	
	}
	
	@Override
	public void mouseClicked(MouseEvent z) {
		if(!(z.getButton()== MouseEvent.BUTTON3)){
					JOptionPane.showMessageDialog(this, "Ca va aujourd'hui?",
		         " Bonjour, BIENVENUE ",  JOptionPane.WARNING_MESSAGE);}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}
		
	

	
	
	@Override
	public void mouseReleased(MouseEvent e) {
		
	JPopupMenu pop = new JPopupMenu("PARAMETRES");
	
	JMenu param = new JMenu ("param1");
	pop.add(param);
	
	JMenuItem orange = new JMenuItem ("orange");
	param.add(orange);
	param.addSeparator();
	orange.addActionListener(new ActionListener() 
	{
		public void actionPerformed(ActionEvent e) {
			getContentPane().setBackground(Color.orange);
		}
	}
			);
		
	if(e.getButton()==MouseEvent.BUTTON3){
			pop.show(getContentPane(),e.getX(), e.getY());
		}
		
	
	}
}
