import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String re="";
		String code , intitule;
		int nbrSeance ;
		Scanner sc = new Scanner(System.in);
		for(int i:new int[]{1,2,3}) {
			re = sc.nextLine();
			System.out.println("Saisir le code du Matier N°"+i);
			code = sc.nextLine();
			System.out.println("Saisir L\'intitule du Matier N°"+i);
			intitule = sc.nextLine();
			while(true) {
				try {
					System.out.println("Saisir Le Nombre des Séance du Matier N°"+i);
					nbrSeance = sc.nextInt();
					break;
				}catch(InputMismatchException e) {
					System.err.println(e.getMessage());
					sc.next();
				}
			}
			Cours c = new Cours(code, intitule);
			try {
				c.setNbrSeance(nbrSeance);
			} catch (NbrSeanceImperative e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			GestionCours.ajouterCours(c);
			Seance s = new Seance(LocalDate.of(2020, 10, 26), LocalTime.of(13, 30), LocalTime.of(15, 30));
			Seance s1 = new Seance(LocalDate.of(2020, 11, 26), LocalTime.of(13, 00), LocalTime.of(15, 00));
			Seance s2 = new Seance(LocalDate.of(2020, 10, 26), LocalTime.of(12, 30), LocalTime.of(14,15));
			try {
				c.ajouterSeance(s);
				c.ajouterSeance(s1);
				c.ajouterSeance(s2);
			} catch (NbreSeanceDepasse e) {
				System.err.println("Nombre De Seance Depassé");
			}
		}
		Collections.sort((ArrayList<Cours>)GestionCours.getLesCours(),(c1,c2)->Integer.compare(c1.getDureeTotal(), c2.getDureeTotal()));
		System.out.println(GestionCours.getLesCours());
	}
}
