package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		/*5. Disena un programa que cuente el numero de veces que aparece una palabra en
		una cadena de texto.*/
		
		encontrarPalabra();
		
	}

	public static void encontrarPalabra() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mete palabra grande aqui: ");
		String cadenaLarga = String.valueOf(sc.nextLine());
		System.out.println("Mete la palabra que quieres buscar: ");
		String palabra = String.valueOf(sc.nextLine());
		int contadorEncontradas = 0;
		boolean esPalabra = false;
		
		for (int i = 0; i < cadenaLarga.length(); i++) {
			if (cadenaLarga.charAt(i) == (palabra.charAt(0))) {
				for (int j = 0; j < palabra.length(); j++) {
					if (cadenaLarga.charAt(i+j) == palabra.charAt(j)) {
						esPalabra = true;
					}else {
						esPalabra = false;
						break;
					}
				}
				
				if (esPalabra == true) {
					contadorEncontradas += 1;
				}
			}
			
		}

		System.out.println(cadenaLarga + " contiene la palabra " + palabra 
				+ " un numero de " + contadorEncontradas + " veces.");
		sc.close();
	}

}
