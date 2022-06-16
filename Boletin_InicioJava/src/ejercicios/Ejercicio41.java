package ejercicios;

import java.util.Scanner;

public class Ejercicio41 {

	public static void main(String[] args) {

		/*41. Realiza un programa que pida un número por teclado y 
		que luego muestre ese número al revés. Utilizar cadenas 
		para facilitar la tarea.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero (o palabra), y te lo mostrare al reves: ");
		String cadena = String.valueOf(sc.nextLine());
		String cadenaInvertida = "";
				
		for (int i = cadena.length() - 1; i >= 0; i--) {
			cadenaInvertida += String.valueOf(cadena.charAt(i));
		}
		
		System.out.println("El numero (o palabra) al invertirlo seria: ");
		System.out.println(cadenaInvertida);
		sc.close();
	}

}
