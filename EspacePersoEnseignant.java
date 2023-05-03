package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

public class EspacePersoEnseignant {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EspacePersoEnseignant window = new EspacePersoEnseignant();
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
	public EspacePersoEnseignant() {
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
		
		JLabel lblNewLabel = new JLabel("Bienvenue sur votre espace perso");
		lblNewLabel.setBounds(123, 11, 164, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Deconnexion");
		btnNewButton.setBounds(255, 227, 148, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConnexionPage.main(null);//permet de rediriger sur une autre page
				frame.dispose();//permet de supprimer la page précédente
			}
		});
		
		JButton btnNewButton_1 = new JButton("Faire l'appel");
		btnNewButton_1.setBounds(123, 56, 164, 23);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AppelEnseignant.main(null);//permet de rediriger sur la page pour faire l'appel
				frame.dispose();//permet de supprimer la page précédente
			}
		});
		JButton btnNewButton_2 = new JButton("Consulter son planning");
		btnNewButton_2.setBounds(111, 109, 189, 23);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsulterPlanningEnseignant.main(null);//permet de rediriger sur le planning de l'enseignant connect�
				frame.dispose();//permet de supprimer la page précédente
			}
		});
		
		JButton btnNewButton_3 = new JButton("Consulter ses absences");
		btnNewButton_3.setBounds(111, 166, 211, 23);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsulterAbsenceEnseignant.main(null);//permet de rediriger sur la page des absences de l'enseignant connect�
				frame.dispose();//permet de supprimer la page précédente
			}
		});
	}
}
