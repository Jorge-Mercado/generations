package areaTriangulo;
import java.util.*;

public class Triangulo {

	public static void main(String[] args) {
	
		int a,b;
		double area;
		// TODO Auto-generated method stub

		
	Scanner scan = new Scanner (System.in);
	
	System.out.println("introduce la altura:");
	  a = scan.nextInt();
	System.out.println("introduce la base:");
	  b = scan.nextInt();
	  
	  area = (b*a)/2;
	 System.out.println("el area del triangulo es: " + area);
			  }
	
}
