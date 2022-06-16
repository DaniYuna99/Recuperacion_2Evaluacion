package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		/*6. Programar un sistema de calefacción-refrigeración que compruebe en función del día y el 
		mes la estación en la que estamos y en función de la estación programe la temperatura: 
		Invierno->19º, Primavera -> 20º, Verano -> 24º, Otoño -> 19º. El método deberá 
		recibir como parámetro el mes y el día actual, y el método deberá devolver los 
		grados a los que deberemos programar el sistema.*/
		
		System.out.println("Programa de calefacción.");
		
		System.out.println("Introduce el mes para indicarte la temperatura "
				+ "en grados centígrados: ");
		Scanner scanner = new Scanner (System.in);
		int mes2 = Integer.valueOf(scanner.next());
		
		System.out.println("Introduce el día: ");
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


