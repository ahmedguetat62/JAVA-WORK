import java.util.Scanner;
public class TestVoiture{
	public static void main(String[] args) {
		Voiture v = new Voiture("222 Tun 193","Renault Megane",20000);
		System.out.print(v+"\n");
		v.setKilometrage(300000);
		System.out.println("Modification sur le kilometrage");
		System.out.println();
		System.out.print("\tmatriculation:"+v.getMatriculation()+"\n\tType Voiture:"+v.getType()+"\n\tla nouvelle Killometrage et "+v.getKilometrage());
		Voiture vv = new Voiture("120 Tun 1330","Citroen Berlango",0); 
		System.out.println("la nouvelle voiture \n"); 
		System.out.println(vv); 
		Scanner scan= new Scanner(System.in);
		System.out.print("\tnew immatriculation:");
		String immat = scan.nextLine();
		//setImmatriculation(immat);
	}
}
