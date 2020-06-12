package habitations;

public abstract class Habitation implements Imposable {
	private Adresse adr;
	private String proprietaire ;
	protected float surface ;
	protected static float impotM2;
	public Habitation(Adresse a,String p , float s ) {
		this.adr =a;
		this.proprietaire = p ; 
		this.surface = s ;
	}
	public static void setImpotM2(float impot) {
		impotM2 = impot;
	}
	public boolean equals(Object h) {
		if(h == null || !(h instanceof Habitation) ) return false; 
		Habitation b = (Habitation)h;
		if(b.adr == null || b.proprietaire == null) return false; 
		return b.adr.equals(this.adr) && b.proprietaire.equals(this.proprietaire);
	}
	public String toString() {
		return adr+"/"+proprietaire+"/"+surface;
	}
}
