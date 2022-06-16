package ejercicios;

public class Ejercicio6 {

	public static void main(String[] args) {

		/*6. Crea tres funciones cuyo comportamiento sea como el de los métodos de String
		startsWith, contains y endsWith, pero sin utilizar ninguno de ellos.*/
		
		//Metodo containsWith
		System.out.println(empiezaPor("cadena", 'c'));
		System.out.println(empiezaPor("cadena", 'b'));
		
		//Metodo contains
		System.out.println(contiene("cadena", 'd'));
		System.out.println(contiene("cadena", 't'));
		
		//Metodo endsWith
		System.out.println(terminaPor("cadena", 'a'));
		System.out.println(terminaPor("cadena", 'b'));


	}
	
	public static boolean empiezaPor(String cadena, char letra) {
		boolean esCierto = false;
		
		if (cadena.charAt(0) == letra) {
			esCierto = true;
		}
		
		return esCierto;
	}
	
	
	public static boolean terminaPor(String cadena, char letra) {
		boolean esCierto = false;
		
		if (cadena.charAt(cadena.length() - 1) == letra) {
			esCierto = true;
		}
		
		return esCierto;
	}
	
	
	public static boolean contiene(String cadena, char letra) {
		boolean esCierto = false;
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == letra) {
				esCierto = true;
			}
		}
		
		return esCierto;
		
	}
	
}
