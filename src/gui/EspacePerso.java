package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class EspacePerso {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EspacePerso window = new EspacePerso();
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
	public EspacePerso(){
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 279);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Gestion Absenses Enseignants");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(102, 23, 202, 23);
		panel.add(btnNewButton);
		
		JButton btnTraitementSurUn = new JButton("Traitement sur un étudiant");
		btnTraitementSurUn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TraitementEtudiant.main(null);//permet de rediriger sur une autre page
				frame.dispose();//permet de supprimer la page précédente
			}
		});
		btnTraitementSurUn.setBounds(102, 57, 200, 23);
		panel.add(btnTraitementSurUn);
		JButton btnNewButton_1_1 = new JButton("Traitement sur les groupes");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBounds(102, 91, 204, 23);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Traitement sur les enseignants");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1.setBounds(102, 125, 204, 23);
		panel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Traitement sur un cours");
		btnNewButton_1_1_1_1.setBounds(102, 159, 204, 23);
		panel.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1_2 = new JButton("Traitement sur les absences des étudiants");
		btnNewButton_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1_2.setBounds(74, 193, 280, 23);
		panel.add(btnNewButton_1_1_1_2);
		
		JButton btnNewButton_1 = new JButton("Deconnexion");
		btnNewButton_1.setBounds(313, 227, 111, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Bienvenue sur votre espace Perso");
		lblNewLabel.setBounds(85, -2, 211, 14);
		panel.add(lblNewLabel);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConnexionPage.main(null);//permet de rediriger sur une autre page
				frame.dispose();//permet de supprimer la page précédente
			}
			});
	}
}
