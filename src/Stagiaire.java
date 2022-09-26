
public class Stagiaire {
	private int matricule;
	private String nom, prenom, filiere;
	private double note1, note2, note3;
	static int nombre_stagiaire = 0;
	
	public Stagiaire() {
		nombre_stagiaire++;
		this.matricule = nombre_stagiaire;
	}
	
	public Stagiaire(String nom, String prenom, String filiere) {
		this.nom = nom;
		this.prenom = prenom;
		this.filiere = filiere;
		
		nombre_stagiaire++;
		this.matricule = nombre_stagiaire;
		
	}
	
	public Stagiaire(String nom, String prenom, String filiere, double note1, double note2, double note3) {
		this.nom = nom;
		this.prenom = prenom;
		this.filiere = filiere;
		this.note1 = note1;
		this.note2 = note2;
		this.note3 = note3;
		
		nombre_stagiaire++;
		this.matricule = nombre_stagiaire;
		
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	public double getNote1() {
		return note1;
	}

	public void setNote1(double note1) {
		this.note1 = note1;
	}

	public double getNote2() {
		return note2;
	}

	public void setNote2(double note2) {
		this.note2 = note2;
	}

	public double getNote3() {
		return note3;
	}

	public void setNote3(double note3) {
		this.note3 = note3;
	}
	
	public  void RAZ() {
		nombre_stagiaire = 0;
	}
	
	public boolean EQUAL(Stagiaire s) {
		if(this.matricule == s.getMatricule()) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean EQUAL(Stagiaire s1, Stagiaire s2) {
		if(s1.getMatricule() == s2.getMatricule()) {
			return true;
		}else {
			return false;
		}
	}
	
	public double CALCUL(double note1, double note2, double note3) {
		double moyenne = (note1 + note2 + note3)/3;
		return moyenne;
	}
	
	public String affiche() {
		return this.matricule + " " + this.nom + " " + this.prenom + " " + this.note1 + " " + this.note2 + " " + this.note3;
	}
}
