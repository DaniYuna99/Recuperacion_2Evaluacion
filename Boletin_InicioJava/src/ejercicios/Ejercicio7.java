package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		/*7. Método que muestre los números del 1 al 100 utilizando la 
		 * instrucción for (para)*/
				
		System.out.println("Programa para contar numeros hasta un limite.");
		System.out.println("Introduce el limite y el programa contara "
				+ "desde 1 hasta ese numero:");
		Scanner scanner = new Scanner (System.in);
		int limiteMaximo = Integer.valueOf(scanner.next());
		
		forHastaelLimite(limiteMaximo);
		
		scanner.close();
		
	}
	
	
	public static void forHastaelLimite (int limite) {
		
		for (int i = 1; i <= limite; i++) {
			System.out.println(i);
		}
	}

}


