
public class NewClass {
	private int x ,y ; 
	public NewClass(int x, int y ) {
		this.x = x; 
		this.y = y;
	}
	public NewClass(int x) {
		this.x  = x ; 
		this.y = 20;
	}
	//get
	public int getY() {
		return y;
	}

	public int getX() {
		return x;
	}

	//setter 
	public void setX(int x ) {
		this.x = x ; 
	}
	public void setY(int y) {
		this.y = y ; 
	}
	public void somme(int a , int b ) {
		System.out.println(a+b); 
	}
	public void somme(int x) {
		System.out.println(x+90);
	}
}
