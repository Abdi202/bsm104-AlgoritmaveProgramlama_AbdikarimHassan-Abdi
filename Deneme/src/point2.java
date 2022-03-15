
public class point2 {
int x;
int y;
 public double distanciFromOgrin() {
	 return Math.sqrt(x*x+y*y);
	 
 }
 public void translate(int dx, int dy) {
	 y+=dx;
	 x+=dy;
 }
}
