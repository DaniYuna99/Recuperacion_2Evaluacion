package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	/*3. Escribir un mÃ©todo que reciba un carÃ¡cter y devuelva el tipo que es. Debe devolver una de
	las se imprimir los siguientes mensajes segÃºn corresponda.
		â—¦ Letra mayÃºscula
		â—¦ Letra minÃºscula
		â—¦ DÃ­gito entre 0 y 9
		â—¦ Signo de puntuaciÃ³n
		â—¦ Espacio en blanco
		â—¦ ParÃ©ntesis () o llaves {}
		â—¦ Otro carÃ¡cter*/
	
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
			tipoCaracter = "El caracter introducido es una letra mayúscula.";
		}else if (Character.isLowerCase(caracter)) {
			tipoCaracter = "El caracter introducido es una letra minúscula.";
		}else if (Character.isDigit(caracter)) {
			tipoCaracter = "El caracter introducido es un número o dígito.";
		}else if (Character.isSpaceChar(caracter)) {
			tipoCaracter = "No se ha introducido ningÃºn caracter; está en blanco.";
		}else if (caracter == ('(') || caracter == (')')) {
			tipoCaracter = "El caracter introducido es un paréntesis.";
		}else if (caracter == ('{') || caracter == ('}')) {
			tipoCaracter = "El caracter introducido es una llave.";
		}else if (caracter == ('¡') || caracter == ('!') 
				|| caracter == ('¿') || caracter == ('?')
				|| caracter == (',') || caracter == ('.')
				|| caracter == (';') || caracter == (':')) {
			tipoCaracter = "El caracter introducido es un signo de puntuación.";
		}else {
			tipoCaracter = "El caracter introducido es otro tipo de caracter no esperado.";
		}
		
		return tipoCaracter;
	}

}
