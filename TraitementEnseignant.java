package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

public class TraitementEnseignant {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TraitementEnseignant window = new TraitementEnseignant();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TraitementEnseignant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton =new JButton("Ajouter Enseigant");
		btnNewButton.setBounds(148, 41, 135, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddEnseignant.main(null);//permet de rediriger sur une autre page
				frame.dispose();//permet de supprimer la page précédente
			}
		});
		
		
		JButton btnNewButton_1 = new JButton("Supprimer Enseignant ");
		btnNewButton_1.setBounds(148, 81, 135, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Gestion Emploi Du Temps");
		btnNewButton_2.setBounds(133, 127, 166, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Retour Espace Perso");
		btnNewButton_3.setBounds(257, 227, 144, 23);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EspacePerso.main(null);//permet de rediriger sur une autre page
				frame.dispose();//permet de supprimer la page précédente
			}
		});
	}
}
