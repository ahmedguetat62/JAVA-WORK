
public class Mouvement {
	private boolean type;
	private String t = "entre";
	private Produit produit;
	private int quantite ;
	public Mouvement(String t , Produit p , int q ) {
		if(t == "entre") this.type=true; 
		else this.type=false; 
		if(produit.getQtStock() < q ) {
			System.out.println("la quantite demande est Superieur a la qte en stock ");
			this.quantite = 0 ;
		}else{
			produit.setQtStock(produit.getQtStock()-q);
			this.quantite = q ;
		}
		if(produit.getQtStock() < produit.getMin()) {
			System.out.println("La quantite Stock devient inferieur a la quantite Min du produit");
		}
			this.produit = p ;
	}
}
