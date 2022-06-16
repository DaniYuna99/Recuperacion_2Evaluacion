package ejercicios;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {

		/*19. Método que pida 15 números y escribir la suma total.*/
		
		int suma = 0;
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 15; i++) {
			System.out.println("Pon un numero: ");
			numero = Integer.valueOf(sc.nextLine());
			suma += numero;
		}
		
		System.out.println("La suma de los numeros introducidos es: " + suma + ".");
		sc.close();
	}

}
