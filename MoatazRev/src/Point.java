
public class Point {
	private float abcisse,ordonne;
	public Point(float a ,float b ) {
		this.abcisse = a ; 
		this.ordonne = b;
	}
	
	public String toSring() {
		return "Point[abcisse:"+this.abcisse+"Ordonne"+this.ordonne+"]"; 
	}
}
