package MODUL;

public class Date {
	
	private int heure;
	private int minute;
	private int jour;
	private int mois;
	private int annee;
	
	
	public Date(int heure, int minute, int jour, int mois, int annee) {
		super();
		this.heure = heure;
		this.minute = minute;
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}
	
	
	public int getHeure() {
		return heure;
	}
	public void setHeure(int heure) {
		this.heure = heure;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getJour() {
		return jour;
	}
	public void setJour(int jour) {
		this.jour = jour;
	}
	public int getMois() {
		return mois;
	}
	public void setMois(int mois) {
		this.mois = mois;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	
}
