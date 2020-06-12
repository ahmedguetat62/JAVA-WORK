package gestionnaire;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import entites.*;

public class gestionnaireAgenda {
	public boolean ajouterRdv(Commerciale c , Rdv r) {
		if(c==null || r == null) return false;
		else {
			Iterator<Rdv> it = c.getAgenda().iterator();
			while(it.hasNext()) {
				if(!it.next().equals(r)) {
					c.getAgenda().add(r);
					return true;
				}
			}
		}
		return false ; 
	}
	public boolean supprimerRdv(Commerciale c , Rdv r ) {
		c.getAgenda().remove(r);
		return true;
	}
	public List<Rdv> getRdvsOfDay(Commerciale c ,LocalDate l){
		List<Rdv> touLesRdv = new ArrayList<Rdv>();
		Iterator<Rdv> it = c.getAgenda().iterator();
		while(it.hasNext()) {
			Rdv r = it.next();
			if(it.next().getDate().equals(l))
				touLesRdv.add((Rdv)it.next());
		}
		return touLesRdv;
	}
	public void changeRdvsOfDay(Commerciale c, LocalDate d, Duration dr) {
		List<Rdv> r = getRdvsOfDay(c, d);
		Iterator<Rdv> it = c.getAgenda().iterator();
		while(it.hasNext()) {
			Rdv m = it.next();
			m.setDate(m.getDate().plus(dr));
		}
	}
}
