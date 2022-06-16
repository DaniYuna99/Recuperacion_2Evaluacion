package ejercicios;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {

		/*22. Leer un número y mostrar su cuadrado, repetir 
		 * el proceso hasta que se introduzca un número negativo.*/
		
		int numero = 1;
		Scanner sc = new Scanner(System.in);
		
		while (numero > 0) {
			System.out.println("Introduce un numero: ");
			numero = Integer.valueOf(sc.nextLine());
			
			if (numero > 0) {
				System.out.println(numero + " al cuadrado es: " + (numero * numero));
			}
		}
		
		System.out.println("Has introducido un numero negativo. "
				+ "Has salido del programa.");
		sc.close();
	}

}
