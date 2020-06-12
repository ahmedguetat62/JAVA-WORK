package tests;
import java.util.*;
import entites.*;
public class Test {
	public static void main(String[] args) {
		Collection<String> mod1 = new TreeSet<String>();
		mod1.add("Espace");
		mod1.add("Captur");
		mod1.add("Clio");
		MarqueVoiture mv1 = new MarqueVoiture("Renault", 1898);
		mv1.setModeles(mod1);
		Collection<String> mod2 = new TreeSet<String>();
		mod2.add("Fiesta");
		mod2.add("Puma");
		mod2.add("Focus");
		MarqueVoiture mv2 = new MarqueVoiture("Ford",1903);
		mv2.setModeles(mod2);
		Collection<String> mod3 = new TreeSet<String>();
		mod3.add("Land Cruiser");
		mod3.add("Prius");
		mod3.add("Yaris");
		MarqueVoiture mv3 = new MarqueVoiture("Toyota",1936);
		mv3.setModeles(mod3);
		Collection<String> mod4 = new TreeSet<String>();
		mod4.add("Punto");
		mod4.add("Linea");
		mod4.add("Tipo");
		mod4.add("Mobi");
		MarqueVoiture mv4 = new MarqueVoiture("Fiat",1898);
		mv4.setModeles(mod4);
		
		Collection<MarqueVoiture> marque = new TreeSet<MarqueVoiture>(
				new Comparator<MarqueVoiture>() {
					@Override
					public int compare(MarqueVoiture a,MarqueVoiture b) {
						return a.getNom().compareTo(b.getNom());
					}
				});
		marque.add(mv1);
		marque.add(mv2);
		marque.add(mv3);
		marque.add(mv4);
		System.out.println(marque);
		Iterator<MarqueVoiture> it = marque.iterator();
		while(it.hasNext()) {
			Iterator<String> modele = it.next().getModeles().iterator();
			while(modele.hasNext())
				if(modele.next().startsWith("P"))
					modele.remove();
		}
	}
}
