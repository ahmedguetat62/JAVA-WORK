package entites;

import java.util.List;

public class Commerciale {
	private String nom ,num;
	
	private List<Rdv> agenda;
	public Commerciale(String num,String nom) {
		this.num = num ;
		this.nom = nom ;
	}
	public List<Rdv> getAgenda(){
		return agenda;
	}
	public void setAgenda(List<Rdv> agenda) {
		this.agenda = agenda;
	}
	@Override
	public String toString() {
		return "Commerciale [\n\tnom=" + nom + "\n\t, num=" + num + ", \n\tagenda=" + agenda + "]";
	}
}
