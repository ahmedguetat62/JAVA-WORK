package Habitation;

public class Habitations {
	private Address adr ; 
	private String proprieter;
	protected float surface;
	protected static float impotM2;
	public Habitations(Address a , String p ,float s ) {
		this.adr = a ; 
		this.proprieter = p ;
		this.surface = s;
	}
	public static void setImpotM2(float impot) {
		impotM2 = impot; 
	}
	
	public boolean equals(Object h) {
		if(h==null || !(h instanceof Habitations) || ((Habitations)h).adr == null || ((Habitations)h).proprieter == null ) return false ; 
		return ((Habitations)h).adr.equals(this.adr) && ((Habitations)h).proprieter.equals(this.proprieter);
	}
	public String toString() {
		return "adresse:"+this.adr+" Proprieter : "+this.proprieter + " surface : "+this.surface;
	}
}
