package ejercicios;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {

		/*21. Realiza un programa que sume los 100 números siguientes a un número entero 
		y positivo introducido por teclado. Se debe comprobar que el dato introducido 
		es correcto (que es un número positivo)*/
		
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el numero al que quieres sumar otros: ");
		int suma = Integer.valueOf(sc.nextLine());
		
		if (suma >= 0) {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Introduce numero: ");
				numero = Integer.valueOf(sc.nextLine());
				
				if (numero >= 0) {
					suma += numero;
					
				}else {
					break;
				}
			}
			
			if (numero <= 0) {
				System.out.println("No se permiten numeros negativos.");
			}else {
				System.out.println("La suma total es: " + suma + ".");
			}
			
		}else {
			System.out.println("No se permiten numeros negativos.");
		}	
		
		sc.close();
			
	}

}
