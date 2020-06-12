package entites;

import java.util.*;

public class Commerciale {
	private String num,nom;
	private List<Rdv> agenda;
	public Commerciale(String nom ,String num) {
		this.nom = nom;
		this.num = num ;
	}
	public List<Rdv> getAgenda() {
		return agenda;
	}
	public void setAgenda(List<Rdv> agenda) {
		this.agenda = agenda;
	}
	
}

