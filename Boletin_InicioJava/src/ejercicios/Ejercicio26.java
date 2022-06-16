package ejercicios;

import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {

		/*26. Crea un programa que permita sumar N números. El usuario 
		 decide cuándo termina de introducir números al indicar la 
		 palabra ‘fin’.*/
		
		int numero = 0;
		int suma = 0;
		String eleccion = "si";
		Scanner sc = new Scanner(System.in);
		
		while (!eleccion.equals("fin")) {
			System.out.println("Numero aqui: ");
			numero = Integer.valueOf(sc.nextLine());
			suma += numero;
			
			System.out.println("¿Continuas o sales? (Para salir teclea 'fin')");
			eleccion = String.valueOf(sc.nextLine());
			eleccion = eleccion.toLowerCase();
		}
		
		System.out.println("Has salido del programa. La suma total de los "
				+ "numeros introducidos es: " + suma);
		sc.close();
		
		
	}

}
