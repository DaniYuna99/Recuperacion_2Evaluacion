package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		/*1. Escribe una función que reciba una cadena 
		de texto y una variable bandera (par/impar) e 
		imprima solo los caracteres que se encuentran 
		situados en las posiciones pares o impares 
		(según indique la variable bandera). Desarrolla 
		el código con un bucle for y después modifica 
		el código para que utilice
		una estructura while.*/
		
		//imprimirCaracteresParesOImpares();
		imprimirCaracteresParesOImparesConWhile();
	}
	

	public static void imprimirCaracteresParesOImpares() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		String cadena = String.valueOf(sc.nextLine());
		System.out.println("¿Quieres imprimir los caracteres pares o impares? (Pon 'P' para pares, cualquier cosa para impares) ");
		String eleccion = String.valueOf(sc.nextLine());
		eleccion = eleccion.toUpperCase();
		boolean imprimirPares = false;
		
		if (eleccion.equals("P")) {
			imprimirPares = true;
		}
		
		if (imprimirPares == true) {
			for (int i = 0; i < cadena.length(); i = i+2) {
				System.out.println(cadena.charAt(i));
			}
			
		}else {
			for (int i = 1; i < cadena.length(); i = i+2) {
				System.out.println(cadena.charAt(i));
			}
		}
		
		sc.close();
	}
	
	
	public static void imprimirCaracteresParesOImparesConWhile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena: ");
		String cadena = String.valueOf(sc.nextLine());
		System.out.println("¿Quieres imprimir los caracteres pares o impares? (Pon 'P' para pares, cualquier cosa para impares) ");
		String eleccion = String.valueOf(sc.nextLine());
		eleccion = eleccion.toUpperCase();
		boolean imprimirPares = false;
		int contador = 0;
		
		if (eleccion.equals("P")) {
			imprimirPares = true;
		}
		
		if (imprimirPares == true) {
			while (contador < cadena.length()) {
				System.out.println(cadena.charAt(contador));
				contador += 2;
			}
			
		}else {
			contador = 1;
			while (contador < cadena.length()) {
				System.out.println(cadena.charAt(contador));
				contador += 2;
			}
		}
		
		sc.close();
	}
}
