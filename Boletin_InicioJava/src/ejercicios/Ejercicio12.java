package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
			
		//12. Metodo que muestre los numeros del 100 al 1 utilizando la instruccion do..while
		
		System.out.println("Programa que muestra los numeros entre el que "
				+ "indique hasta el 1, a la inversa.");
		System.out.println("Indique el numero: ");
	
		Scanner scanner = new Scanner (System.in);
		int comienzo2 = Integer.valueOf(scanner.next());
		
		cuentaAtrasConBucleWhile(comienzo2);
		
		scanner.close();
	
	}
		
	public static void cuentaAtrasConBucleWhile(int comienzo) {
			
		while (comienzo > 0) {
			System.out.println(comienzo);
			comienzo--;
		}
	}
}
