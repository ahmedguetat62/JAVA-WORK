import Utilitaire.Date;

public class Reservation {
	private String numero ; 
	private Date date ;
	private String client ;
	private boolean confirme=false; 
	public Reservation(String numero ,String client,Date date ) {
		this.numero = numero;
		this.date = date ;
		this.client = client;
	}
	public String getNumero() {
		return this.numero;
	}
	public boolean isConfirmer() {
		return this.confirme;
	}
	public void setConfirmer(boolean confirmer) {
		this.confirme = confirmer ;
	}
	public Date getDate() {
		return this.date ;
	}
	public String getClient() {
		return this.client ; 
	}
	@Override
	public String toString() {
		return "Reservation " + numero + ":client=" + client + "-" + date + "-" + (confirme? "-confirmer":"-non confirmer");
	}
}
