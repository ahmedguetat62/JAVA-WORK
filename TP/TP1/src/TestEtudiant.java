
public class TestEtudiant {

    public static void main(String args[]){
        
    	/*args[0] args[1] est vide non intiliser  
    	 * pas d'instance 
    	 * 
    	 * Etudiant e=new Etudiant(args[0], args[1]) ;
        System.out.println ("\n   Le nouvel "+ e) ;*/
        args = new String[2]; 
    	args[0] = "Tounsi" ; 
    	args[1] = "Sami"; 
    	Etudiant v = new Etudiant(args[0], args[1]); 
    	System.out.println(v);
    }
}
