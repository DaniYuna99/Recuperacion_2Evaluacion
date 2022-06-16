package ejercicios;

import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {

		/*23. Pedir números hasta que se teclee uno negativo, y mostrar 
		cuántos números se han introducido.*/
		
		int numero = 1;
		int contadorNumeros = 0;
		Scanner sc = new Scanner(System.in);
		
		while (numero > 0) {
			System.out.println("Introduce numero: ");
			numero = Integer.valueOf(sc.nextLine());
			
			if (numero > 0) {
				contadorNumeros++;
			}
		}
		
		System.out.println("Te has salido del programa.");
		System.out.println("Has introducido " + contadorNumeros + " numeros.");
		
		sc.close();
	}

}
