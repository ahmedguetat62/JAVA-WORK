package entites;

import java.time.*;

public class Rdv {
	private LocalDateTime date ;
	private String lieu,client;
	public Rdv(LocalDateTime date,String lieu,String client) {
		this.date = date ; 
		this.client = client;
		this.lieu = lieu;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public String getLieu() {
		return lieu;
	}
	public String getClient() {
		return client;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public void setClient(String client) {
		this.client = client;
	}
	@Override
	public boolean equals(Object ob) {
		if(date.equals(((Rdv)ob).date)) return true;
		return false; 
	}
	@Override
	public String toString() {
		return "Rdv [date=" + date + ", lieu=" + lieu + ", Client=" + client + "]";
	}
}
