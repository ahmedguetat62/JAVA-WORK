abstract class Animal /*extends*/ implements EtreVivant {

	private float poids;
	private float taille;
	public Animal(float poids,float taille) {
		//super(taille);
		this.poids=poids;
		this.taille=taille; 
	}
	public abstract  void manger();
	
	public void dormir(){System.out.println("Je dors");}
	
	public  void evoluer() {manger(); dormir();}
	
	public String toString() {
		return "Animal (poids=" + poids + ", taille=" +  taille + ")";
	}

}// fin classe Animal