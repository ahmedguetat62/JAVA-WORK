
public class Capteur {
	private String code;
	private float[] mesure; 
	private int nbMesure ; 
	private static int nbMesureMax = 3 ; 

	public Capteur(String code ) {
		this.code = code ;
		this.mesure=new float[nbMesureMax];
	}
	public void AjouterMesure(float f) {
		if(nbMesure<nbMesureMax)
			mesure[nbMesure++] = f ;
	}
	public void reset() {
		mesure = new float[nbMesureMax];
		nbMesure = 0 ;
	}
	public void envoyer(Station st) {
		if(st==null) return;  
		st.recevoir(this);   
		this.reset();
	}
	public static int getNbMesure() {
		return nbMesureMax;
	}
	public void setNbMesure(int nbMesure) {
		this.nbMesure = nbMesure;
	}
	public String getCode() {
		return code;
	}
	public String toString() {
		String s = "{capteur :"+code+" mesure:[";
		for(float m : mesure) {
			s+= m+" ";
		}
		s+="];}";
		return s;
	}
}
