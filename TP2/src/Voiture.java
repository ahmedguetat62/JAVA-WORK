//package org.nahla.tn;

public class Voiture {
	private String immatriculation;
	private String modele;
	private int kilometrage;
	
	public Voiture(String immatriculation, String modele, int kilometrage) {
		this.immatriculation = immatriculation;
		this.modele = modele;
		this.kilometrage = kilometrage;
	}
	//getter
	public int getKilometrage() {
		return kilometrage;
	}
	public String getType() {
		return modele;
	}
	public String getMatriculation() {
		return immatriculation;
	}
	//setter
	public void setKilometrage(int kilometrage) {
		this.kilometrage = kilometrage;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String toString() {
		return "Voiture : immatriculation=" + immatriculation + ", modele=" 
				+ modele + ", kilometrage=" + kilometrage;
	}
}
