package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
	
	public static void main(String[] args) {
		
		/*8. Muestra los números del 1 al 100 utilizando la instruccion 
		while (mientras)*/
		
		System.out.println("Programa que cuenta hasta un numero usando un bucle While.");
		System.out.println("Introduce el numero para que el programa cuente hasta el: ");
		Scanner scanner = new Scanner (System.in);
		int limite = Integer.valueOf(scanner.next());
				
		whileHastaelLimite(limite);
				
		scanner.close();

	}
		
	public static void whileHastaelLimite(int limit) {
			
		int acumulador = 1;
			
		while (acumulador < limit + 1) {
			System.out.println(acumulador);
			acumulador++;
		}
	}
}
