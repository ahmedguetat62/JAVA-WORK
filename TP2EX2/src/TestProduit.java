/* 
 * 7 : oui tu peut modifier la qteStock du produit p3
 */
public class TestProduit {
	public static void main(String[] args) {
		
		Produit p1 = new Produit("Souris","2",100);
		p1.setQtStock(200);
		System.out.println(p1);
		p1.setQtStock(20);
		System.out.println(p1);
		Produit p3 = new Produit("souris","1");
		p3.setQtStock(20);
		System.out.println(p3.getQtStock());
		if(p1.egal(p1, p3)) System.out.println("egal");
		else System.out.println("n'est pas egal");
	}
}
