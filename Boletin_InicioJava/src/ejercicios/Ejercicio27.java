package ejercicios;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {

		/*27. Pedir 10 sueldos. Mostrar su suma y cuantos 
		 hay mayores de 1000€.*/
		
		int sueldo = 0;
		int suma = 0;
		int contSueldosMayores = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Introduce un sueldo: ");
			sueldo = Integer.valueOf(sc.nextLine());
			
			if (sueldo > 1000) {
				contSueldosMayores++;
			}else if (sueldo < 0) {
				break;
			}
			
			suma += sueldo;
			
		}
		
		if (sueldo < 0) {
			System.out.println("No existen sueldos negativos "
						+ "porque no seria un sueldo, seria ilegal y "
						+ "esclavitud.");
			
		}else if (sueldo >= 0) {
			System.out.println("La suma de los sueldos es: " + suma);
			System.out.println("De los sueldos introducidos, " 
			         + contSueldosMayores + " son mayores de 1000 euros.");
		}
		
		sc.close();
	}

}
