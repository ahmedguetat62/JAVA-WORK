package gestionnaires;
import java.time.*;
import java.util.*;
import entites.*;
public class GestionnaireAgendas {
	public boolean ajouterRdv(Commerciale c, Rdv r) {
		int t = 0 ; 
		if(c == null || r == null)return false;
		else {
			Iterator<Rdv> it =  c.getAgenda().iterator();
			while(it.hasNext()) if(it.next().equals(r)) t = 1;
		}
		if(t==0) {
			c.getAgenda().add(r);
			return true;
		}
		return false;
	}
	public boolean supprimerRdv(Commerciale c , Rdv r) {
		c.getAgenda().remove(r);
		return true; 
	}
	public List<Rdv> getRdvsofDay(Commerciale c , LocalDate ldt) {
		List<Rdv> touslesrdv = new ArrayList<Rdv>() ;
		Iterator<Rdv> it = c.getAgenda().iterator();
			while(it.hasNext()) {
				Rdv r = it.next();
				if(r.getDate().toLocalDate().equals(ldt))
					touslesrdv.add(r);
			}
		return touslesrdv; 
	}
	
	public void changeRdvsOfDay(Commerciale c, LocalDate d, Duration dr) {
		/*Iterator<Rdv> it= c.getAgenda().iterator();
		while(it.hasNext()) {
			Rdv r = it.next();
			if(r.getDate().toLocalDate().equals(d)) {
				r.setDate(r.getDate().plus(dr));
			}
		}*/
		List<Rdv> r = getRdvsofDay(c, d);
		Iterator<Rdv> it = r.iterator();
		while(it.hasNext()) {
			Rdv x = it.next();
			x.setDate(x.getDate().plus(dr));
		}
	}
	@Override
	public String toString() {
		return "GestionnaireAgendas []";
	}
	
}
