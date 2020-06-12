package Habitation;

public class Address {
	private int numero;
	private String rue,ville;
	public Address(int n, String r,String v) {
		this.numero=n;
		this.rue=r;
		this.ville=v;
	}
	public boolean equals(Object ob) {
		if (this == ob) return true;
		if (!(ob instanceof Address)) return false;
		Address a = (Address) ob;

		if (rue== null)
		{ if (a.rue!= null) return false; }
		else if (!rue.equals(a.rue)) return false;

		if (ville== null) { if (a.ville!= null) return false; }
		else if (!ville.equals(a.ville)) return false;

		return  numero==a.numero;
	}
}
