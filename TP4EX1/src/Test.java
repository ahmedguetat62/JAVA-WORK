public class Test {
	public static void main(String[] args) {
		Souris souris = new Souris(10, 0.3f) ;
		Fennec fennec = new Fennec(40, 3) ;
		Animal a = souris; 
		Animal b = fennec ;
		a.manger();
		b.manger();
		a.evoluer();
		b.evoluer();
		
		Souris c = (Souris) a; // down-casting 
		c.manger();
		//Souris = (Souris) b ; => erreur 

		Fennec e = (Fennec) b ;
		e.manger();
		/*
		 * UP-CASTING 
		 * DOWN-CASTING 
		 */ 
		// quest 4
		
		EtreVivant[] LesEtreVivant ={
				new Souris(10,0.5f),new Herbe(10.2f),new Fennec(11, 0.3f),new Fennec(12, 0.3f)
				,new Herbe(13),new Souris(8.2f,0.8f),new Souris(7, 0.1f)
		};
		// qu 5
		for(EtreVivant E : LesEtreVivant)
			E.evoluer();
		// q 6 
		System.out.println("Les nom des class");
		for(EtreVivant E : LesEtreVivant)
			System.out.println(E.getClass().getName());
	}// fin main
}