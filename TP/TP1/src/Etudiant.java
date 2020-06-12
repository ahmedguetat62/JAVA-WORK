
public class Etudiant {

	//Attributes
	private String nom;
	private String prenom;
	private int annee; //1, 2 ou 3
	
	//Construct 
	public Etudiant(String nom, String prenom, int annee) {
		this.nom = nom;
		this.prenom = prenom;
		this.annee = annee;
	}
	
	
	public Etudiant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.annee=1;
	}


	//Getter
	public String getNom() {
		return nom;
	}
	//Setter
	public String getPrenom() {
		return prenom;
	}

	//Modificateurs
	public void setNom(String nom) {
		this.nom = nom;
	}


	@Override
	public String toString() {
		return "Etudiant : nom=" + nom + ", prenom=" + prenom + ", annee="
				+ annee + "\n";
	}

	public static void main(String[] args) {
		Etudiant e1=new Etudiant("TOUMI", "Ali", 1);
		System.out.print("\n   C'est l'"+e1);
	}

	
}
