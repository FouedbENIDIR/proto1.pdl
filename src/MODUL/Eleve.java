package MODUL;

public class Eleve  {
	private String prenom;
	private String nom;
	private int id;
	private String motDePasse;
	private String filiere;
	private String mail;
	
		public Eleve(int id, String prenom, String mail, String filiere, String nom, String motDePasse) {
		this.prenom = prenom;
		this.nom = nom;
		this.id = id;
		this.motDePasse = motDePasse;
		this.filiere = filiere;
		this.mail = mail;
	}
		
	public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getMotDePasse() {
			return motDePasse;
		}

		public void setMotDePasse(String motDePasse) {
			this.motDePasse = motDePasse;
		}

	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String newNom) {
		this.nom = newNom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String newPrenom) {
		this.prenom = newPrenom;
	}
	public void display() {
		System.out.println("Donnees de l'eleve :\n");
		System.out.println("Nom :\n"+nom);
		System.out.println("Prenom :\n"+prenom);
		System.out.println("Filiere :\n"+filiere);
		System.out.println("Mail :\n"+mail);
		System.out.println("Pass :\n"+motDePasse);
	}
	
}
	
	
