import java.io.ObjectInputStream.GetField;


import Utilitaire.Date;

public class TestReservation {
	public static void main(String[] args) {
		Vol v1 = new Vol("v001","Tunis","France",new Date(11,01,2017),new Date(11,01,2017),25);
		Reservation r1 = new Reservation("r001", "bbb",new Date(17,11,2016));
		Reservation r2 = new Reservation("r002", "aaa",new Date(26,11,2016));
		Reservation r3 = new Reservation("r003", "ccc",new Date(01,12,2016));
		Reservation r4 = new Reservation("r004", "ddd",new Date(01,12,2016));
		v1.ajouterReservation(r1);v1.ajouterReservation(r2);
		v1.ajouterReservation(r3);v1.ajouterReservation(r4);
		r2.setConfirmer(true);
		r3.setConfirmer(true);
		r4.setConfirmer(true);
		// foreach 
		for(Reservation r : v1.getReservationNonConfirmer()) {
			v1.annulerReservation(r);
		}
		System.out.println(v1);
		
		
	}
}
