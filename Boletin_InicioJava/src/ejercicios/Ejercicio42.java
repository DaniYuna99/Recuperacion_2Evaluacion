package ejercicios;

import java.util.Scanner;

public class Ejercicio42 {

	public static void main(String[] args) {

		/*42. Realizar un m�todo que dada una cadena de entrada, 
		comprueba si es una contrase�a FUERTE o D�BIL. Se considera 
		que una contrase�a es fuerte si: 
			-Contiene 8 o m�s caracteres 
			-Entre ellos al menos hay una may�scula, una min�scula, 
			un signo de puntuaci�n y un d�gito.*/
		
		Scanner sc = new Scanner(System.in);
		String resultado = "";
		boolean contieneMayus = false;
		boolean contieneMinus = false;
		boolean contieneSigno = false;
		boolean contieneDigito = false;
		char letra;
		
		System.out.println("Introduce una palabra, y comprobare si es "
				+ "una contrasena fuerte o debil: ");
		String cadena = String.valueOf(sc.nextLine());
		
		
		if (cadena.length() >= 8) {
			
			for (int i = 0; i < cadena.length(); i++) {
				letra = cadena.charAt(i);
				
				if (Character.isUpperCase(letra)) {
					contieneMayus = true;
					
				}else if (Character.isLowerCase(letra)) {
					contieneMinus = true;
					
				}else if (letra == '.' || letra == ';' || letra == ':'
						|| letra == ',' || letra == '�' || letra == '!'
						|| letra == '`' || letra == '?' || letra == '�'
						|| letra == '"' || letra == '�') {
					contieneSigno = true;
					
				}else if (Character.isDigit(letra)) {
					contieneDigito = true;
				}
			}
			
			
			if (contieneMayus == true && contieneMinus == true 
					&& contieneSigno == true && contieneDigito == true) {
				resultado = "La contrasena " + cadena + " es FUERTE.";
				
			}else {
				resultado = "La contrasena " + cadena + " es DEBIL.";
			}
			
			
		}else {
			resultado = "La contrasena " + cadena + " es DEBIL.";
		}
		
		
		System.out.println(resultado);
		sc.close();
		
	}

}
