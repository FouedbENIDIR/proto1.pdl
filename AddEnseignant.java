package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JToolBar;

import DAO.EnseignantDAO;
import MODUL.Enseignant;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class AddEnseignant {

	private JFrame frame;
	private JTextField Prenom;
	private JTextField Nom;
	private JTextField Telephone;
	private JTextField Id;
	private JTextField Mail;
	private JTextField MotDePasse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEnseignant window = new AddEnseignant();
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
	public AddEnseignant() {
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
		
		Id = new JTextField();
		Id.setColumns(10);
		Id.setBounds(118, 129, 96, 19);
		frame.getContentPane().add(Id);
		
		
		
		Prenom = new JTextField();
		Prenom.setBounds(118, 42, 96, 19);
		frame.getContentPane().add(Prenom);
		Prenom.setColumns(10);
		
		Nom = new JTextField();
		Nom.setBounds(118, 71, 96, 19);
		frame.getContentPane().add(Nom);
		Nom.setColumns(10);
		
		Telephone = new JTextField();
		Telephone.setBounds(118, 100, 96, 19);
		frame.getContentPane().add(Telephone);
		Telephone.setColumns(10);
		
		Mail = new JTextField();
		Mail.setColumns(10);
		Mail.setBounds(326, 42, 96, 19);
		frame.getContentPane().add(Mail);
		
		MotDePasse = new JTextField();
		MotDePasse.setColumns(10);
		MotDePasse.setBounds(326, 71, 96, 19);
		frame.getContentPane().add(MotDePasse);
		
		JLabel lblNewLabel_1_3 = new JLabel("ID Enseignant  : ");
		lblNewLabel_1_3.setBounds(10, 133, 96, 13);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1 = new JLabel("Prénom : ");
		lblNewLabel_1.setBounds(23, 45, 71, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nom : ");
		lblNewLabel_1_1.setBounds(23, 74, 71, 13);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Téléphone : ");
		lblNewLabel_1_2.setBounds(23, 103, 96, 13);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_4 = new JLabel("Mail: ");
		lblNewLabel_1_4.setBounds(253, 45, 96, 13);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Mot De Passe  : ");
		lblNewLabel_1_4_1.setBounds(224, 58, 82, 45);
		frame.getContentPane().add(lblNewLabel_1_4_1);
		
	
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.setBounds(174, 218, 85, 21);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnseignantDAO enseignant = new EnseignantDAO();
				String prenom = Prenom.getText(); //on récupère ce qui est dans le Jpanel et on l'associe à un string
				String nom = Nom.getText();
				String mail = Mail.getText();
				int id = Integer.parseInt(Id.getText());

				String motDePasse = MotDePasse.getText();
				String telephone = Telephone.getText();
				Enseignant e1= new Enseignant(1234, nom ,prenom ,mail , telephone, motDePasse);
				 
				 enseignant.add(e1);
				
				EspacePerso.main(null);//permet de rediriger sur une autre page
				frame.dispose();//permet de supprimer la page précédente
			}
		});
	}

}