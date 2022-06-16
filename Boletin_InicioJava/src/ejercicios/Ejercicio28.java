package ejercicios;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {

		/*28. Escribe un programa que muestre los n primeros términos 
		de la serie de Fibonacci. El primer término de la serie de 
		Fibonacci es 0, el segundo es 1 y el resto se calcula sumando 
		los dos anteriores, por lo que tendríamos que los términos 
		son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
		144… El número n se debe introducir por teclado.*/
		
		long numAnterior = 0;
		long numActual = 1;
		long numSiguiente = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantos numeros quieres de la secuencia de Fibonacci? ");
		int limite = Integer.valueOf(sc.nextLine());
		
		if (limite <= 0) {
			System.out.println("No se permiten numeros negativos ni ceros.");
			
		}else if (limite <= 93) {
			for (int i = 1; i <= limite; i++) {
				if (i == 1) {
					System.out.println(numAnterior);
				}else if (i == 2) {
					System.out.println(numActual);
				}else if (i > 2) {
					numSiguiente = numAnterior + numActual;
					System.out.println(numSiguiente);
					numAnterior = numActual;
					numActual = numSiguiente;
				}
				
			}
			
		}else if (limite >= 94) {
			System.out.println("A partir del numero 94, el programa se desborda debido a "
					+ "lo grande que son los numeros resultantes a partir de ese punto. Por lo "
					+ "que no esta permitido.");
		}
		
		
		
		sc.close();

	}

}
