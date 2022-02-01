package ejercicios;

import java.util.*;

public class Ejemplo {

	public static void main(String[] args) {

		System.out.println(
				"Bienvenido a la tiendita de los estudiambres, \nA continuación te ofrecemos el siguiente menú... \n1. Paquete básico \n2. Paquete chucherías \n3. Paquete sano \n4. Paquete romántico");
		System.out.println("Introduce el número que corresponde a la opción que quieres");
		Scanner scan = new Scanner(System.in);
		double option = scan.nextInt();
		if (option == 1) {
			System.out.println("El precio del paquete 1000");
		} else if (option == 2) {
			System.out.println("El precio del paquete 2000");
		} else if (option == 3) {
			System.out.println("El precio del paquete 3000");
		} else if (option == 4) {
			System.out.println("El precio del paquete 4000");
		} else {
			System.out.println(
					"Hoy no me surtieron de esa joven... hijole joven te la debo... hoy no fio, mañana sí... no hay yaaa");
		}

		/*
		 * String str1 = "String method tutorial"; String str2 =
		 * "compareTo method example"; String str3 = "String method tutorial";
		 * 
		 * 
		 * int var1 = str2.compareTo( str1 );
		 * System.out.println("str1 & str2 comparison: "+var1); int var2 =
		 * str1.compareTo( str3 ); System.out.println("str1 & str3 comparison: "+var2);
		 * int var3 = str2.compareTo("compareTo method example");
		 * System.out.println("str2 & string argument comparison: "+var3);
		 * 
		 */
	}

}
