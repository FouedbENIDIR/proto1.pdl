package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EspacePersoEtudiant {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EspacePersoEtudiant window = new EspacePersoEtudiant();
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
	public EspacePersoEtudiant() {
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
		btnNewButton.setBounds(287, 227, 116, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConnexionPage.main(null);//permet de rediriger sur la page de connexion
				frame.dispose();//permet de supprimer la page précédente
			}
		});
		
		JButton btnNewButton_1 = new JButton("Consulter don planning");
		btnNewButton_1.setBounds(162, 57, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsulterPlanningEtudiant.main(null);//permet de rediriger sur la page Planning Etudiant
				frame.dispose();//permet de supprimer la page précédente
			}
		});
		
		JButton btnNewButton_2 = new JButton("Consulter ses absences");
		btnNewButton_2.setBounds(123, 109, 164, 23);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsulterAbsenceEleve.main(null);//permet de rediriger sur les absences etudiantes
				frame.dispose();//permet de supprimer la page précédente
			}
		});
		
	}

}
