package ejerciciosGenerations;
import java.util.*;
public class CalculateAreaCircle {

	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in);
		double  pi = 3.1416;
		int diameter;
		double radious;
		double area;
		double perimeter;
		//calculates the area and perimeter of the circle.
	System.out.println("introduce the diameter: ");
	diameter = SC.nextInt();

	radious = ((double)diameter/2) ;
	area = (radious * radious)* pi;
	perimeter = pi* radious;
	
	
	System.out.println("perimeter: " + perimeter + " and area of circle: " + area);
	}// end of main 

}
