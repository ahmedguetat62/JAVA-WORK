import java.util.ArrayList;
import java.util.Collection;

public class Cours {
	private String code , intitule;
	private int NbrSeance;
	private Collection<Seance> seanceCours;
	
	public Cours(String code, String intitule) {
		this.code = code;
		this.intitule = intitule;
	}
	
	public void setNbrSeance(int nbrSeance) throws NbrSeanceImperative {
		if(nbrSeance<0||nbrSeance>30)
			throw new NbrSeanceImperative();
		NbrSeance = nbrSeance;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cours other = (Cours) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}
	
	public boolean ajouterSeance(Seance s) throws NbreSeanceDepasse {
		if(s == null) return false; 
		if(seanceCours == null ) seanceCours = new ArrayList<>();
		if(seanceCours.contains(s)) return false; 
		if(seanceCours.size() == NbrSeance) throw new NbreSeanceDepasse(); 
		return seanceCours.add(s);
	}
	
	@Override
	public String toString() {
		String ss = "";
		for(Seance s : seanceCours)
			if(s != null)
				ss += s;
		return "Cours [code=" + code + ", intitule=" + intitule + ", NbrSeance=" + NbrSeance + ", seanceCours="
				+ ss + "]";
	}
	
	public int getDureeTotal() {
		int sum = 0 ;
		for(Seance s :seanceCours) {
			if(s!=null)
				sum += s.getDuree();
		}
		return sum;
	}
}
