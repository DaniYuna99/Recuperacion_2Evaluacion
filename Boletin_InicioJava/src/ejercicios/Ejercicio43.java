package ejercicios;

import java.util.Scanner;

public class Ejercicio43 {

	public static void main(String[] args) {
		
		/*43. Elabora un programa que codifique una cadena, de tal modo que 
		en el resultado se inviertan cada 2 caracteres. Los caracteres 
		intercambiados no pueden volver a intercambiarse.
		Ejemplo:
		
		Entrada -> Hola mundo
		Salida -> oHalm nuod*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra, y te desplazare sus caracteres: ");
		String cadena = String.valueOf(sc.nextLine());
		String cadenaDesplazada = "";
		int indice = 0;
		
		for (int i = 0; i < cadena.length(); i++) {
			indice = i + 2;
			
			if (indice > cadena.length()) {
				indice = (indice - (cadena.length() - 1));
			}
			
			cadenaDesplazada += cadena.charAt(indice);
		}
		
		System.out.println(cadenaDesplazada);
		sc.close();
		
	}
}
