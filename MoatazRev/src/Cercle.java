import java.math.*;
class Cercle implements FormeGeometrique{
	
	private Point Centre ; 
	private double rayon ; 
	///////////////////////
	public Cercle(Point p,double b) {
		this.Centre = p ;
		this.rayon = b;
	}
	/////////////////////////
	@Override 
	public double perimtre() {
		return 2*this.rayon*Math.PI;
	}
	public double surface() {
		return Math.PI*this.rayon*this.rayon;
	}
	public String toString() {
		return "Cercle[Point:"+this.Centre+"|rayon:"+this.rayon+"]";
	}


}
