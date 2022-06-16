package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		//10. Escribe los numeros del 100 al 1 utilizando la instruccion for
		
		System.out.println("Programa para contar desde el numero que se "
				+ "indique hasta el 1.");
		System.out.println("Indica el numero:");
		Scanner scanner = new Scanner (System.in);
		int comienzo2 = Integer.valueOf(scanner.next());
		
		forDesdeComienzoHasta1(comienzo2);
		
		scanner.close();
		
	}
	
	
	public static void forDesdeComienzoHasta1 (int comienzo2) {
		for (int i = comienzo2; i > 0; i--) {
			System.out.println(i);
		}
	}
}
