
public class Produit {
	//public final int qtStock = 100 ; si on veut le declaré final on doit supprimer le setter 
	private String nom ,code ; 
	private int qtStock,qtMin;
	public  Produit(String n ,String c , int qteMin ) {
		this.nom = n ; 
		this.code = c ; 
		this.qtMin = qteMin;
	}
	public  Produit(String n ,String c) {
		this.nom = n; 
		this.code = c; 
	}
	public int getMin() {
		return this.qtMin;
	}
	public String getCode() {
		return this.code;
	}
	public int getQtStock() {
		return qtStock;
	}
	public void setQtStock(int qtStock) {
		this.qtStock = qtStock;
	}
	public String toString() {
		return "Produit [nom=" + nom + ", code=" + code + ", qtStock=" + qtStock + ", qtMin=" + qtMin + "]";
	}
	public boolean egal(Produit  pr1 , Produit pr2){
		if (pr1.getCode() == pr2.getCode()) return true;
		return false;
	}
	public static void main(String[] args) {
		try {
			Produit p1 = new Produit("Souris","2",100);
			//System.out.println(p1); //no only if it was declared with static 
			Mouvement m1 = new Mouvement("entre",p1, 10);
			System.out.println(m1); 
		}catch(Exception e ) {
			System.out.println(e.getMessage());
		}
	}
	
	 
}
