package habitations;

public class Adresse {
//Attributs
private int numero;
private String rue;
private String ville;

//*****constructeur******//
public Adresse(int n, String r, String v) {this.numero = n; this.rue = r; this.ville = v;}

//*****String toString()******//
public String toString() {return numero + "-" + rue + "-" + ville;}


//*****boolean equals(Adresse a)******//
public boolean equals(Object ob){
	if (this == ob) return true;
	if (!(ob instanceof Adresse)) return false;
	Adresse a = (Adresse) ob;
	
	if (rue== null)
	{ if (a.rue!= null) return false; }
	else if (!rue.equals(a.rue)) return false;
	
	if (ville== null) {
		if (a.ville!= null) return false; 
	}
	else if (!ville.equals(a.ville)) return false;
	
	return  numero==a.numero;
}// fin equals()

}// fin classe Adresse