package tests;
import Habitation.*;
import Comune.*;

public class Test {

	public static void main(String[] args) {
		// création d'une commune c1
		Commune c1= new Commune();
		
		// création de deux objets "Individuelle"
		Habitations i1= (Habitations) new Individuelle(new Address(14,"kkkk","Tunis"), "Salah Abid", 120.4f, 3);
		Habitations i2= (Habitations) new Individuelle(new Address(10,"mmmm","Sfax"), "Ahlem Mhiri", 90.2f, 2);
		
		
		//création de deux objets "Professionnelle"
		Habitations p1= new Professionnelle(new Address(11,"klll","Tunis"), "Tarek Abidi", 111.1f, 5);
		Habitations p2= new Professionnelle(new Address(88,"dddd","Sousse"), "Samir Hadrich", 66.7f, 2);
		
		//
		Habitations.setImpotM2(30);
		Individuelle.setImpotPiece(46);
		
		//...
		c1.ajouter((Imposable)i1);
		c1.ajouter((Imposable)p1);
		c1.ajouter((Imposable)i2);
		c1.ajouter((Imposable)p2);
	}

}
