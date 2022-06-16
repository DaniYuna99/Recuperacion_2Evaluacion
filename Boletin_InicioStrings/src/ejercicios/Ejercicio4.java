package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		/*4. Un numero es divisible por 3 si la suma de todas sus cifras reducidas a una cifra es
		igual a 0, 3, 6, 9.
		
		Por ejemplo, 156 , 1+5+6=12 , 1+2 = 3 es divisible,
		pero 157 , 1+5+7 =13 , 1+3 =4 no lo es.
		
		Elabora un programa que compruebe la divisibilidad por 3 segun este algoritmo. El
		programa debe comprobar que el numero facilitado es valido.*/
		
		comprobarSiNumeroDivisiblePor3();
		
	}
	
	
	public static void comprobarSiNumeroDivisiblePor3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce numero y comprobare si "
				+ "es divisible por 3 sumando sus cifras una a una: ");
		String numero = String.valueOf(sc.nextLine());
		int sumaNumero = 0;
		
		for (int i = 0; i < numero.length(); i++) {
			sumaNumero += Integer.valueOf(numero.charAt(i));
		}
		
		if (sumaNumero % 3 == 0) {
			System.out.println("El numero " + numero + " es divisible por 3.");
		}else {
			System.out.println("El numero " + numero + " NO es divisible por 3.");
		}
		
		sc.close();
	}

}
