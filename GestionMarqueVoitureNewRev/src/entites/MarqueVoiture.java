package entites;

import java.util.*;

public class MarqueVoiture {
	private String nom ; 
	private int anneParution;
	private Collection<String> modeles;
	public MarqueVoiture(String nom, int anneParution) {
		this.nom = nom;
		this.anneParution = anneParution;
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
	@Override
	public String toString() {
		return "****\n"+"Marque Voiture [nom= "+nom+" anneeParution= "+anneParution+",\n Modeles=[" +modeles+"]]\n****";	
	}
	@Override
	public boolean equals(Object ob) {
		if(this == ob) return true ;
		if(ob== null) return false;
		if(getClass() != ob.getClass()) return false;
		if(nom == null) {
			if(((MarqueVoiture)ob).nom != null) return false; 
			else if(!nom.equals(((MarqueVoiture)ob).nom)) return false; 
		}
		return true; 		
	}
}
