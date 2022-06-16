package ejercicios;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {

		/*20. Método que pida 5 números e indica si alguno es múltiplo de 3.*/
		
		String multiplos3 = "";
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Introduce numero: ");
			numero = Integer.valueOf(sc.nextLine());
			
			if (numero % 3 == 0) {
				multiplos3 += String.valueOf(numero + " ");
				
			}
		}
		
		System.out.println("Los numeros que son multiplos de 3 "
				+ "de los introducidos fueron: " + multiplos3);
		sc.close();
		
	}

}
