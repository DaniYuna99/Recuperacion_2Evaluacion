package ejercicios;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {

		/*25. Realiza un programa que vaya pidiendo números hasta que se 
		introduzca un número negativo y nos diga cuantos números se han 
		introducido, la media de los impares y el mayor de los pares. El 
		número negativo sólo se utiliza para indicar el final de la introducción de 
		datos pero no se incluye en el cómputo.*/
		
		int numero = 1;
		int contadorNum = 0;
		int contadorImpares = 0;
		int sumaImpares = 0;
		int numMayorPar = 0;
		double mediaImpares = 0.0;
		Scanner sc = new Scanner(System.in);
		
		while (numero > 0) {
			System.out.println("Introduce numero: ");
			numero = Integer.valueOf(sc.nextLine());
			
			if (numero > 0) {
				contadorNum++;
				
				if (numero % 2 == 0) {
					if (numero > numMayorPar) {
						numMayorPar = numero;
					}
					
				}else if (numero % 2 == 1) {
					sumaImpares += numero;
					contadorImpares++;
				}
				
			}
			
		}
		
		System.out.println("-------------------------------------------------");
		System.out.println("Has salido del programa al introducir un numero negativo.");
		System.out.println("Has introducido " + contadorNum + " numeros.");
		
		
		if (contadorImpares != 0 && sumaImpares != 0) {
			mediaImpares = (sumaImpares / contadorImpares);
			System.out.println("La media de los numeros impares introducidos es: " 
					+ (mediaImpares));
		}else if (contadorImpares != 0) {
			System.out.println("No se han introducido numeros impares.");
		}
		
		
		if (numMayorPar == 0) {
			System.out.println("No se ha introducido ningun numero par.");
		}else if (numMayorPar != 0) {
			System.out.println("El numero par mas grande introducido ha sido: " + numMayorPar);
		}
		
		sc.close();
		
	}

}
