package Utilitaire;
public class Date {
    private int jour;
    private int mois;
    private int annee;
    
    public Date(int jour, int mois, int annee) {
        if (mois < 1 || mois > 12 || jour < 1 || jour > 31 
                || jour == 31 && (mois == 4 || mois == 6 || mois == 9 || mois == 11)
                || jour >= 30 && mois == 2 
                || jour == 29 && mois == 2 && annee % 4 != 0) {
            System.out.println("Date incorrecte");
            System.exit(0);
        }
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
       
    }

    public int getJour() {
        return jour;
    }

    public int getMois() {
        return mois;
    }

    public int getAnnee() {
        return annee;
    }

  

    public String toString() {
        return  jour + "/" + mois + "/"+ annee;
    }

    public boolean avant(Date d) {
        return annee < d.annee || annee == d.annee && mois < d.mois
                || annee == d.annee && mois == d.mois && jour <= d.jour;
    }

    public boolean egale(Date d){
    	return jour==d.jour && mois==d.mois&& annee==d.annee;}
    
    public boolean apres(Date d) {
        return !avant(d)&&!egale(d);
    }

    public static void main(String[] args) {
        Date a = new Date(15, 2, 2013);
        Date b = new Date(10, 7, 2013);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.avant(b)? a+ " vient avant "+b : b+ " vient avant "+a);
    }
}

