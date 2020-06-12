package tests;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

import entites.*;
import gestionnaires.*;
public class Test {
	public static void main(String[] args) {
		Commerciale c = new Commerciale("1", "Ahmed");
		List<Rdv> r = new ArrayList<Rdv>();
		c.setAgenda(r);
		Rdv r1 = new Rdv(LocalDateTime.parse("2020-03-25T13:30:00"), "Café Mama Rosa", "Walid");
		Rdv r2 = new Rdv(LocalDateTime.parse("2020-03-26T09:30:00"), "Café Belvue", "Ahmed");
		Rdv r3 = new Rdv(LocalDateTime.parse("2020-03-26T11:15:00"), "Restaurant Tonton", "Slim");
		Rdv r4 = new Rdv(LocalDateTime.parse("2020-03-27T09:00:00"), "Café Belvue", "Ali");
		Rdv r5 = new Rdv(LocalDateTime.parse("2020-03-27T14:30:00"), "Café Claudana", "Mahdi");
		
		
		GestionnaireAgendas g = new GestionnaireAgendas();
		g.ajouterRdv(c, r1);
		g.ajouterRdv(c, r2);
		g.ajouterRdv(c, r3);
		g.ajouterRdv(c, r4);
		g.ajouterRdv(c, r5);
		System.out.println(c);
		
		g.changeRdvsOfDay(c,LocalDate.parse("2020-03-27"), Duration.of(90, ChronoUnit.MINUTES));

	}
}
