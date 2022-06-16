package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		//11. Muestra los numeros del 100 al 1 utilizando la instruccion while
		
		System.out.println("Programa para contar a la inversa desde "
				+ "el numero que se indique.");
		System.out.println("Indica el numero: ");
		Scanner scanner = new Scanner (System.in);
		int comienzo2 = Integer.valueOf (scanner.next());
		
		whileHastaElComienzo(comienzo2);
		
		scanner.close();

	}
	
	public static void whileHastaElComienzo(int comienzo) {
		
		while (comienzo > 0) {
			System.out.println(comienzo);
			comienzo--;
		}
	}
}
