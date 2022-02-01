package ejerciciosGenerations;

import java.util.*;

public class ControldeFlujoGithub1 {

	public static void main(String[] args) {

		// above 10000$ 30%
		// 5001 - 9999$ 20%
		// 1001 - 4999$ 10%
		// below 1000$ N/A
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingresa tu número de ventas");
		double sales = scan.nextDouble();
		double comission = 0;
		if (sales > 10000) {
			comission = sales * 0.3;
		} else if (sales > 5000 && sales < 10000) {
			comission = sales * 0.2;
		} else if (sales > 1000 && sales < 5000) {
			comission = sales * 0.1;
		} else {
			System.out.println("No hay comisión igual o debajo de $1000");
			System.out.println("Tu comisión es: " + comission);
		}
	}

}
