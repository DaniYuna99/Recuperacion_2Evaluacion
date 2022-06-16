package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		/*6. Programar un sistema de calefacci�n-refrigeraci�n que compruebe en funci�n del d�a y el 
		mes la estaci�n en la que estamos y en funci�n de la estaci�n programe la temperatura: 
		Invierno->19�, Primavera -> 20�, Verano -> 24�, Oto�o -> 19�. El m�todo deber� 
		recibir como par�metro el mes y el d�a actual, y el m�todo deber� devolver los 
		grados a los que deberemos programar el sistema.*/
		
		System.out.println("Programa de calefacci�n.");
		
		System.out.println("Introduce el mes para indicarte la temperatura "
				+ "en grados cent�grados: ");
		Scanner scanner = new Scanner (System.in);
		int mes2 = Integer.valueOf(scanner.next());
		
		System.out.println("Introduce el d�a: ");
		Scanner scanner2 = new Scanner (System.in);
		int dia2 = Integer.valueOf(scanner2.next());
		
		System.out.println(sistemaCalefaccion(mes2, dia2));
		
		scanner.close();
		scanner2.close();
		
		
	}
	
	
	public static int sistemaCalefaccion (int mes, int dia) {
		
		int temperatura = 0;
		
		if (mes == 12 && dia >= 21 && dia < 32|| mes == 1 
				|| mes == 2 || mes == 3 && dia < 21 && dia > 0) {
			temperatura = 19;
			
		}else if (mes == 3 && dia >= 21 && dia < 32|| mes == 4 
				|| mes == 5 || mes == 6 && dia < 21 && dia > 0) {
			temperatura = 20;
			
		}else if (mes == 6 && dia >= 21 && dia < 32|| mes == 7 
				|| mes == 8 || mes == 9 && dia < 23 && dia > 0) {
			temperatura = 24;
			
		}else if (mes == 9 && dia >= 23 && dia < 32|| mes == 10 
				|| mes == 11 || mes == 12 && dia < 21 && dia > 0) {
			temperatura = 19;
			
		}else {
			temperatura = -1;
		}
		
		return temperatura;
	}



}


