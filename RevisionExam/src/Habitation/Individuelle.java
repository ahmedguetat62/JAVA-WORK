package Habitation;

public class Individuelle extends Habitations{
	private int nbPiece ;
	private static float impotPiece;
	public Individuelle(Address a,String p , float s ,int nP) {
		super(a,p,s);
		this.nbPiece = nP ; 
	}
	public static void setImpotPiece(float Impot) {
		impotPiece = Impot ; 
	}
	public float impot() {
		return (impotPiece*nbPiece)+(super.surface*super.impotM2);
	}
	public String toString() {
		return super.toString()+" nbrePiece "+this.nbPiece;
	}
}
