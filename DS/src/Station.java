
public class Station {
	private String nom ; 
	private Capteur[] capteur; 
	private int nbRecues,Nbcapteur ;
	private String[] recues ;
	
	public Station(String nom,int nbMaxCapteur , int nbMaxRecue) {
		this.nom = nom;
		this.capteur = new Capteur[nbMaxCapteur];
		this.recues = new String[nbMaxRecue];
	}
	

	public void recevoir(Capteur c) {
		if(c==null) return;
		int i=0;   
		while(i<Nbcapteur && !capteur[i].getCode().equals(c.getCode()))     
			i++;   
		if(i==Nbcapteur&& Nbcapteur<capteur.length)     capteur[Nbcapteur++]=c;
		if(nbRecues<recues.length)    recues[nbRecues++]=c+"";
	}
	public String toString() {
		String s = "Station :"+nom+",recues[";
		for(String r : recues) 
			if(r!=null) s+="\n"+r+"\n";
		s+="]";
		return s;
	}
}
