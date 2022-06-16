package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	/*3. Escribir un método que reciba un carácter y devuelva el tipo que es. Debe devolver una de
	las se imprimir los siguientes mensajes según corresponda.
		◦ Letra mayúscula
		◦ Letra minúscula
		◦ Dígito entre 0 y 9
		◦ Signo de puntuación
		◦ Espacio en blanco
		◦ Paréntesis () o llaves {}
		◦ Otro carácter*/
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el caracter: ");
		String chara = String.valueOf(sc.nextLine());
		char caracter = chara.charAt(0);
		
		System.out.println(devolverTipoCaracter(caracter));
		
		sc.close();
	}
	
	public static String devolverTipoCaracter(char caracter) {
		String tipoCaracter = "";
		
		if (Character.isUpperCase(caracter)) {
			tipoCaracter = "El caracter introducido es una letra may�scula.";
		}else if (Character.isLowerCase(caracter)) {
			tipoCaracter = "El caracter introducido es una letra min�scula.";
		}else if (Character.isDigit(caracter)) {
			tipoCaracter = "El caracter introducido es un n�mero o d�gito.";
		}else if (Character.isSpaceChar(caracter)) {
			tipoCaracter = "No se ha introducido ningún caracter; est� en blanco.";
		}else if (caracter == ('(') || caracter == (')')) {
			tipoCaracter = "El caracter introducido es un par�ntesis.";
		}else if (caracter == ('{') || caracter == ('}')) {
			tipoCaracter = "El caracter introducido es una llave.";
		}else if (caracter == ('�') || caracter == ('!') 
				|| caracter == ('�') || caracter == ('?')
				|| caracter == (',') || caracter == ('.')
				|| caracter == (';') || caracter == (':')) {
			tipoCaracter = "El caracter introducido es un signo de puntuaci�n.";
		}else {
			tipoCaracter = "El caracter introducido es otro tipo de caracter no esperado.";
		}
		
		return tipoCaracter;
	}

}
