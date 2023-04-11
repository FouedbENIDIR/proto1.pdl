package gui;

import DAO.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import DAO.ConnectionDAO;
import MODUL.Eleve;
import java.awt.Label;

public class AddEleve {

	private JFrame frame;
	private JTextField Prenom;
	private JTextField Nom;
	private JTextField Mail;
	private JTextField Filiere;
	private JTextField MotDePasse;
	private JTextField Id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEleve window = new AddEleve();
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
	public AddEleve() {
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
		
		JLabel lblNewLabel = new JLabel("Ajouter un √©l√®ve:");
		lblNewLabel.setBounds(56, 27, 151, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pre©nom : ");
		lblNewLabel_1.setBounds(56, 60, 71, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nom : ");
		lblNewLabel_2.setBounds(56, 83, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mail : ");
		lblNewLabel_3.setBounds(56, 107, 45, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Filiere : ");
		lblNewLabel_4.setBounds(56, 130, 71, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("Mot de passe :");
		lblNewLabel_6.setBounds(56, 153, 96, 13);
		frame.getContentPane().add(lblNewLabel_6);
		
		Label label = new Label("Id eleve :");
		label.setBounds(68, 180, 59, 21);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.setBounds(161, 211, 85, 21);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.setBackground(new Color(128, 128, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EleveDAO eleve = new EleveDAO();
				String prenom = Prenom.getText(); //on rÈcupÈre ce qui est dans le Jpanel et on l'associe √† un string
				String nom = Nom.getText();
				String mail = Mail.getText();
				String filiere = Filiere.getText();
				String motDePasse = MotDePasse.getText();
				String id = Id.getText();
				
				 Eleve e1= new Eleve(1234, nom,prenom,mail, filiere, motDePasse);
				 
				 eleve.add(e1);
				
				EspacePerso.main(null);//permet de rediriger sur une autre page
				frame.dispose();//permet de supprimer la page pr√©c√©dente
			}
		});
		
		Prenom = new JTextField();
		Prenom.setBounds(149, 57, 96, 19);
		frame.getContentPane().add(Prenom);
		Prenom.setColumns(10);
		
		Nom = new JTextField();
		Nom.setBounds(149, 80, 96, 19);
		frame.getContentPane().add(Nom);
		Nom.setColumns(10);
		
		Mail = new JTextField();
		Mail.setBounds(149, 104, 96, 19);
		frame.getContentPane().add(Mail);
		Mail.setColumns(10);
		
		Filiere = new JTextField();
		Filiere.setBounds(149, 127, 96, 19);
		frame.getContentPane().add(Filiere);
		Filiere.setColumns(10);
		
		MotDePasse = new JTextField();
		MotDePasse.setBounds(149, 150, 96, 19);
		frame.getContentPane().add(MotDePasse);
		MotDePasse.setColumns(10);
		
		Id = new JTextField();
		Id.setBounds(149, 182, 96, 19);
		frame.getContentPane().add(Id);
		Id.setColumns(10);
		
		
	}
}
