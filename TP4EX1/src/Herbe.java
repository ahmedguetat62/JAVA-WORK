class Herbe /*extends*/ implements EtreVivant {
	float taille; 
	public Herbe(float taille) {
		//super(taille);
		this.taille = taille;
	}

	public void pousser(){
		System.out.println("Je pousse");
	}
	
	public void evoluer() {pousser();}
	public String toString() {	return "Herbe (taille=" +taille + ")";
	}
} // fin classe Herbe