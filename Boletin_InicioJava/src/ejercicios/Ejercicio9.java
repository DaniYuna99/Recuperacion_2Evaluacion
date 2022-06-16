package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		/* 9. Metodo que muestre los numeros del 1 al 100 utilizando 
		 * la instruccion do.while (repetir .. hasta)*/
		
		System.out.println("Programa que repita numeros hasta el que se "
				+ "indique con un Do-While.");
		System.out.println("Determina el numero para que el programa "
				+ "cuente hasta el: ");
		Scanner scanner = new Scanner (System.in);
		int limite = Integer.valueOf (scanner.next());
		
		doWhileHastaelLimite(limite);
		
		scanner.close();

	}
	
	
	public static void doWhileHastaelLimite(int limit) {
		
		int acumulador = 1;
		
		do {
			System.out.println(acumulador);
			acumulador++;
		
		}while (acumulador < limit + 1);
	}
}
