
public class pointMain {

	public static void main(String[] args) {
		point point1 =new point();
		point1.x =3;
	  point1.y = -4;

		 point point2 =new point();
		 point2.x =5;
		 point2.y = -7;
		 System.out.println("point1"+point1.x + ","+point1.y);
		// System.out.println("point2"+point2.x + ","+point2.y);
		 double dist = Math.sqrt(point1.x*point1.x+ point1.y*point1.y);
    System.out.println("dist from original"+ dist);
    
    System.out.println("point2"+point2.x + ","+point2.y);
	// System.out.println("point2"+point2.x + ","+point2.y);
	 double dist2 = Math.sqrt(point2.x*point2.x+ point2.y*point2.y);
  System.out.println("dist from original"+ dist2);
  
  // translate new location
   point1.x +=10;
   point1.y +=6;
   point2.x +=6;
   point2.y +=7;
   System.out.println("point1"+point1.x + ","+point1.y);
 System.out.println("point2"+point2.x + ","+point2.y); 
		
	} 

}
