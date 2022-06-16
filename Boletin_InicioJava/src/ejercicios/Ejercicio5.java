package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		/*5. Realiza un método que reciba una hora por parámetro y que muestre luego buenos días, 
		buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y
		de 21 a 5. respectivamente. Sólo se tienen en cuenta las horas.*/
		
		System.out.println("Introduce una hora y te saludaré debidamente:");
		Scanner scanner = new Scanner (System.in);
		int hora = Integer.valueOf(scanner.next());
		
		System.out.println(horaDada(hora));
		
		scanner.close();
		
	}
		
	public static String horaDada (int hora) {
		
		String resultado = "";
			
		if (hora >= 25 || hora <= 0) {
			resultado = "El valor introducido no es válido.";
				
		}else if (hora <= 5) {
			resultado = "Buenas noches.";
					
		}else if (hora >= 6 && hora <= 12) {
			resultado = "Buenos días.";
					
		}else if (hora >= 13 && hora <= 20) {
			resultado = "Buenas tardes.";
			
		}else if (hora >= 21) {
			resultado = "Buenas noches.";
		}
			
		return resultado;
	}
		
}


