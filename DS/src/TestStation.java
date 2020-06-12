
public class TestStation {
	public static void main(String[] args) {
		Capteur c = new Capteur("C100");
		for(int i =0 ; i<Capteur.getNbMesure();i++) {
			c.setNbMesure(21+i);
		}
		Station st = new Station("Station Nord",10,10);
		c.envoyer(st);
		for(int i =0 ; i<Capteur.getNbMesure();i++) {
			c.setNbMesure(24+i);
		}
		c.envoyer(st);
		System.out.println(st);
	}
}
