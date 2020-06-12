
public class Enseignant {
	private String nom;
	private String prenom;
	private String grade; 

	//constructor
	public Enseignant(String nom, String prenom, String grade) {
		this.nom = nom;
		this.prenom = prenom;
		this.grade = grade;
	}
	public Enseignant(String nom , String prenom) {
		this.nom = nom ; 
		this.prenom = prenom ; 
		this.grade = "Assistant";
	}
	//getters
	public String getNom() {
		return nom;
	}
	//setters
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return "Enseignant [nom=" + nom + ", prenom=" + prenom + ", grade=" + grade + "]";
	}

	public static void main(String[] args) {
		Enseignant e1=new Enseignant("TOUMI", "Ali", "Maitre Assistant");
		Enseignant e2 = new Enseignant("Toumi", "Rami");
		//System.out.println(e1.getNom());
		System.out.println("\n   C'est l'"+e1);	
		System.out.println("\n   C'est l'"+e2);	
	}
}