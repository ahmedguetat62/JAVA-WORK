package entites;
import java.util.*;
public class MarqueVoiture {
	private String nom ;
	
	private int anneParution;
	private Collection<String>modeles;
	public MarqueVoiture(String nom,int annee) {
		this.nom = nom ;
		this.anneParution = annee;
	}
	public Collection<String> getModeles(){
		return modeles;
	}
	public void setModeles(Collection<String> modeles) {
		this.modeles = modeles;
	}
	public String getNom() {
		return nom;
	}
	public int getAnneParution() {
		return anneParution;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setAnneParution(int anneParution) {
		this.anneParution = anneParution;
	}
	@Override
	public String toString() {
		return "****\n"+"Marque Voiture [nom= "+nom+" anneeParution= "+anneParution+",\n Modeles=[" +modeles+"]]\n****";	
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj ) return true;
		if(obj== null) return false;
		if(getClass() != obj.getClass()) return false;
		MarqueVoiture other = (MarqueVoiture) obj ; 
		if(nom == null)
			if(other.nom != null) return false;
			else if(!nom.equals(other.nom)) return false;
		return true;
	}
}
