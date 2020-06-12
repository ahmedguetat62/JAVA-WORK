package Habitation;

public class Professionnelle extends Habitations {

	private int nbEmployer;
	public Professionnelle(Address a,String p , float s , int n) {
		super(a,p,s);
		this.nbEmployer = n ;
	}
	public float impot() {
		return (super.surface*super.impotM2*this.nbEmployer)/10;
	}
	public String toString() {
		return super.toString() + "nbrmployer:"+this.nbEmployer;
	}
	
}
