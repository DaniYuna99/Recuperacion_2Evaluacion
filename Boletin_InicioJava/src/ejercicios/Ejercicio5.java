package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		/*5. Realiza un m�todo que reciba una hora por par�metro y que muestre luego buenos d�as, 
		buenas tardes o buenas noches seg�n la hora. Se utilizar�n los tramos de 6 a 12, de 13 a 20 y
		de 21 a 5. respectivamente. S�lo se tienen en cuenta las horas.*/
		
		System.out.println("Introduce una hora y te saludar� debidamente:");
		Scanner scanner = new Scanner (System.in);
		int hora = Integer.valueOf(scanner.next());
		
		System.out.println(horaDada(hora));
		
		scanner.close();
		
	}
		
	public static String horaDada (int hora) {
		
		String resultado = "";
			
		if (hora >= 25 || hora <= 0) {
			resultado = "El valor introducido no es v�lido.";
				
		}else if (hora <= 5) {
			resultado = "Buenas noches.";
					
		}else if (hora >= 6 && hora <= 12) {
			resultado = "Buenos d�as.";
					
		}else if (hora >= 13 && hora <= 20) {
			resultado = "Buenas tardes.";
			
		}else if (hora >= 21) {
			resultado = "Buenas noches.";
		}
			
		return resultado;
	}
		
}


