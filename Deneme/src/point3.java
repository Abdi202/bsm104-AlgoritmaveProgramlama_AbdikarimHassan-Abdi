
public class point3 {
	int x;
	int y;
	public point3(int x,int y) {
	this.x=x;
	this.y=y;
	}
	
	 public double distanciFromOgrin() {
		 return Math.sqrt(x*x+y*y);
		 
	 }
	 public void translate(int dx, int dy) {
		 y+=dx;
		 x+=dy;

	 }
}
