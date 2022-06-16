package ejercicios;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {

		/*24. Programa que reciba 10 números y nos indique cuál de ellos 
		 * es el máximo (el mayor).*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero, y te indico al final "
				+ "cuál es el mayor de todos los que metas: ");
		int numero = Integer.valueOf(sc.nextLine());
		int numMax = numero;
		
		for (int i = 1; i <= 9; i++) {
			System.out.println("Otro numero: ");
			numero = Integer.valueOf(sc.nextLine());
			
			if (numero > numMax) {
				numMax = numero;
			}
		}
		
		System.out.println("Introduciste 10 numeros, "
				+ "y el mayor de todos es: " + numMax + ".");
				
		sc.close();
		
	}

}
