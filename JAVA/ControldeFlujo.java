package ejerciciosGenerations;

import java.util.*;
//variable = (condition) ? expressionTrue :  (condition)?  expression true :expressionFalse; 
public class ControldeFlujo {

	public static void main(String[] args) {
	
		Scanner SC = new Scanner(System.in);
		
		int edad; 
		System.out.println("ingresa tu edad: ");
		edad = SC.nextInt();

		
		if(edad > 0 && edad < 18) {
			
			System.out.println("eres menor de edad");
			
		}else if (edad > 18 && edad <= 150) {
			System.out.println("eres mayor de edad");
		}else {
			
			
			System.out.println("error.. introduce un numero valido");
		}
	}

}
