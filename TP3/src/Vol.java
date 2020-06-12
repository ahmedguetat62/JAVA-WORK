import java.util.Scanner;

import java.util.Arrays;
import java.util.Collections;

import Utilitaire.Date;

public class Vol {
	private String numero ; 
	private String aereportDepart;
	private String aereportArrivee;
	private Date dateDepart;
	private Date dateArrivee;
	private int nbSiege ;
	private Reservation reservation[];
	private int nbSiegesReserve;
	public Vol(String numero, String aereportDepart, String aereportArrivee, Date dateDepart
				, Date dateArrivee,int nbSiege) {
		this.numero = numero;
		this.aereportDepart = aereportDepart;
		this.aereportArrivee = aereportArrivee;
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
		this.nbSiege = nbSiege;
		this.reservation = new Reservation[this.nbSiege]; //dec du taille du tableau 
	}
	
	@Override
	public String toString() {
		String chainer="" ; 
		for(int i=0;i<reservation.length&&reservation[i]!=null;i++) {
			chainer +=reservation[i]+"\n";
		}
		
		return "Vol " + numero + ":\n" + aereportDepart + "("+dateDepart+")-->" + aereportArrivee
			+ "("+dateArrivee+") | " + nbSiege + "/" +nbSiegesReserve+"Siege reserver\n" 
			+ "***Reservation***\n" + chainer +"\n*****";
	
	}
	public boolean ajouterReservation(Reservation r) {
		if(r == null) {
			System.out.println("la reservation n'est pas cree");
			return false; 
		}
		if(nbSiegesReserve==nbSiege) {
			System.out.println("le vol N°"+this.numero+"est complet(pas de siege)");
			return false ;
		}
		for(int i=0;i<=reservation.length;i++) {
			if(r.getNumero().equals(reservation[i].getNumero())) {
				System.out.println("L vol N°:" +r.getNumero()+"exist deja");
				return false;
			}
		}
		this.nbSiegesReserve++;
		return true;

	}
	public boolean annulerReservation(Reservation r) {
		Reservation x ;
		if(r == null ) return false ;
		for(int i=0;i<=reservation.length&&reservation[i]!=null;i++) {
			if(r.getNumero().equals(reservation[i].getNumero())){
				for(int j=i;j<reservation.length;j++)
					reservation[j]=reservation[j+1];
				//mettre  la dernier case null
				reservation[--nbSiegesReserve]=null;
				System.out.println("la reservation a ete annuler");
			}
		}
		System.out.println("la reservation n'exit pas");
		return false ;
	}
	public Reservation[] getReservationNonConfirmer() {
		Reservation[] nonconfirmer = new Reservation[nbSiegesReserve];
		int j =0;
		for(int i =0 ; i<reservation.length&&reservation[i]!=null;i++)
		{		
			if(reservation[i].isConfirmer() == false) {
				nonconfirmer[j] = reservation[i];
				j++;
			}
		}
		return nonconfirmer;
	}
	public String[] getClientReserver() {
		String[] clientReserver = new String[nbSiegesReserve];
		
		for(int i = 0 ; i < reservation.length&&reservation[i]!=null;i++)
			if(reservation[i].isConfirmer()) {
				clientReserver[i] = reservation[i].getClient();
			}
		Arrays.sort(clientReserver);
		return clientReserver;

	}
	public static void main(String[] args) {

		Vol v1 = new Vol("v001","Tunis","France",new Date(11,01,2017),new Date(11,01,2017),25);
		Reservation r1 = new Reservation("r001", "bbb",new Date(17,11,2016));
		Reservation r2 = new Reservation("r002", "aaa",new Date(26,11,2016));
		Reservation r3 = new Reservation("r003", "ccc",new Date(01,12,2016));
		Reservation r4 = new Reservation("r004", "ddd",new Date(01,12,2016));
		// Ajouter Une reservation d'une volle 
		v1.ajouterReservation(r1);
		v1.ajouterReservation(r2);
		v1.ajouterReservation(r3);
		v1.ajouterReservation(r4);
		// Confirmation des reservation
		r2.setConfirmer(true);
		r3.setConfirmer(true);
		r4.setConfirmer(true);
		// Annulation des reservation 
		for(Reservation r : v1.getReservationNonConfirmer()) {
			v1.annulerReservation(r);
		}
		System.out.println(v1);
		/*************** Error ***********///////////
		for(String  r : v1.getClientReserver()) 
			System.out.println(r);
		//*************************/////////
		// Scanner -> import java.util.Scanner ; 
		Scanner clv = new Scanner(System.in);
		System.out.println("Veuille saisir le numero");
		String num = clv.nextLine();
		String Client = clv.nextLine();
		String date = clv.nextLine();
		try {
		Reservation r5 = new Reservation(num, Client,
				new Date(
					Integer.parseInt(date.substring(0,date.indexOf("/"))),
					Integer.parseInt(date.substring(date.indexOf("/")+1,date.lastIndexOf("/"))),
					Integer.parseInt(date.substring(date.lastIndexOf("/")+1)
						)));
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
}
