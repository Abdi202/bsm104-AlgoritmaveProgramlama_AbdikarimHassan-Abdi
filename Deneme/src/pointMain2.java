
public class pointMain2 {
	public static void main(String[] args) {
	
	point2 ptt =new point2();
	ptt.x =4;
	ptt.y =3;
	ptt.translate(3, -3);
	
	System.out.println("point1"+ptt.x + ","+ptt.y);
	
	System.out.println("distancifrom ogrinal" +ptt.distanciFromOgrin());
	}
} 

