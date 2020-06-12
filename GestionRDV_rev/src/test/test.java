package test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import entites.Commerciale;
import entites.Rdv;
import gestionnaire.gestionnaireAgenda;

public class test {
	public static void main(String[] args) {
		Commerciale c1 = new Commerciale("Ahmed","1");
		
		Rdv r1 = new Rdv(LocalDateTime.parse("2020-03-25T15:30:00"),"Café Mama Rosa","Walid");
		Rdv r2 = new Rdv(LocalDateTime.parse("2020-03-26T09:30:00"),"Café Belvue","Ahmed");
		Rdv r3 = new Rdv(LocalDateTime.parse("2020-03-26T11:15:00"),"Restaurant Tonton","Slim");
		Rdv r4 = new Rdv(LocalDateTime.parse("2020-03-27T09:00:00"),"Café Belvue","Ali");
		Rdv r5 = new Rdv(LocalDateTime.parse("2020-03-27T14:30:00"),"Café Claudana","Mahdi");
		List<Rdv> agenda = new ArrayList<Rdv>();
		c1.setAgenda(agenda);
		gestionnaireAgenda ga= new gestionnaireAgenda();
		ga.ajouterRdv(c1, r1);
		ga.ajouterRdv(c1, r2);
		ga.ajouterRdv(c1, r3);
		ga.ajouterRdv(c1, r4);
		ga.ajouterRdv(c1, r5);
		
		
		ga.changeRdvsOfDay(c1, LocalDate.parse("2020-03-27"), Duration.of(90,ChronoUnit.MINUTES));
	}
}
