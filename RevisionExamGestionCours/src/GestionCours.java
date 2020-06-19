import java.util.ArrayList;
import java.util.Collection;

public class GestionCours {
	private static Collection<Cours> LesCours;
	public static boolean ajouterCours(Cours c) {
		if(c == null) return false ;
		if(LesCours == null) LesCours = new ArrayList<>();
		if(LesCours.contains(c)) return false;
		return LesCours.add(c);
	}
	
	public static Collection<Cours> getLesCours() {
		return LesCours;
	}
	
	
}
