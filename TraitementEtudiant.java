package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

public class TraitementEtudiant {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TraitementEtudiant window = new TraitementEtudiant();
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
	public TraitementEtudiant() {
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
		
		JButton btnNewButton = new JButton("Retour Espace Perso");
		btnNewButton.setBounds(232, 217, 171, 21);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EspacePerso.main(null);//permet de rediriger sur une autre page
				frame.dispose();//permet de supprimer la page précédente
			}
		});
		
		JButton btnNewButton_1 = new JButton("Ajouter un Eleve");
		btnNewButton_1.setBounds(132, 38, 171, 21);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddEleve.main(null);//permet de rediriger sur une autre page
				frame.dispose();//permet de supprimer la page précédente
			}
		});
		
		JButton btnNewButton_1_1 = new JButton("Modifier un Eleve");
		btnNewButton_1_1.setBounds(133, 81, 170, 21);
		frame.getContentPane().add(btnNewButton_1_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModifierEleve.main(null);//permet de rediriger sur une autre page
				frame.dispose();//permet de supprimer la page précédente
			}
		});
		
		JButton btnNewButton_1_1_1 = new JButton("Supprimer un Eleve");
		btnNewButton_1_1_1.setBounds(131, 122, 171, 21);
		frame.getContentPane().add(btnNewButton_1_1_1);
	}

}
