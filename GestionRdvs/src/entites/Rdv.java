package entites;

import java.time.LocalDateTime;

public class Rdv {
	LocalDateTime date;
	String lieu ,Client;
	
	public Rdv(LocalDateTime date , String lieu , String Client) {
		this.date = date ; 
		this.Client = Client; 
		this.lieu = lieu;
	}
	public LocalDateTime getDate() {
		return date;
		
	}
	public String getLieu() {
		return lieu;
	}
	public String getClient() {
		return Client;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public void setClient(String client) {
		Client = client;
	}
	@Override
	public boolean equals(Object obj) {
		if(((Rdv)obj).date.equals(date)) return true;
		return false; 
	}
	@Override
	public String toString() {
		return "Rdv [date=" + date + ", lieu=" + lieu + ", Client=" + Client + "]";
	}

}
