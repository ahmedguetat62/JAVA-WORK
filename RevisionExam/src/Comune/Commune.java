package Comune;
import Habitation.*;
public class Commune {
	private Imposable[] tabHabitation = new Imposable[1000];
	private int nombre =0; 
	public boolean ajouter(Imposable h) {
		if(h == null || nombre == tabHabitation.length) return false;  
		for(Imposable p : tabHabitation)
			if(!p.equals(h)) {
				tabHabitation[nombre++] = h;
				return true; 
			}	
		return false ;
	}
	public Imposable[] chercher(float impot) {
		Imposable[] newtab = new Imposable[nombre];
		int j =0 ; 
		for(int i=0;i<tabHabitation.length&&tabHabitation[i]!=null;i++)
			if(tabHabitation[i].impot()>impot)
				newtab[j++] = tabHabitation[i];
		return newtab;
	}
	public float getImpotTotal() {
		float total =0 ;
		for(int i=0;i<tabHabitation.length&&tabHabitation[i]!=null;i++) 
			total+=tabHabitation[i].impot();
		return total ; 
	}
	public String toString() {
		String chainer="";
		for(Imposable m : tabHabitation)
			chainer += "/t" +m ;
		return "Commune :\n\t"+chainer;
	}
	public static float[] getImpotHabitation(Commune C){
		float tab[] = new float[C.nombre+1];
		for(int i =0 ; i< C.nombre ; i++) 
			tab[i]=C.tabHabitation[i].impot();
		tab[C.nombre] = C.getImpotTotal();
		return tab;
	}
}
