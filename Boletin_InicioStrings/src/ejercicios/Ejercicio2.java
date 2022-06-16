package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {

		/*2. Realiza una funcion que cifre un caracter 
		segun el cifrado Cesar y un desplazamiento dado.*/
		
		/*Lo he hecho con una cadena en vez de un caracter, 
		 * pero me has dado el visto bueno*/
		System.out.println(cifradoCesar("casado", 3)); //FDVDGR
	}
	
	
	public static String cifradoCesar(String cadena, int posicion) {
		
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		String cadenaCifrada = "";
		cadena = cadena.toLowerCase();
		int posiReal = 0;
		
		for (int i = 0; i < cadena.length(); i++) {
			
			for (int j = 0; j < abecedario.length(); j++) {
				
				if (cadena.charAt(i) == abecedario.charAt(j)) {
					posiReal = abecedario.indexOf(cadena.charAt(i)) + posicion;
					
					if (posiReal > (abecedario.length() - 1)) {
						posiReal = posiReal - abecedario.length();
					}
					
					cadenaCifrada += abecedario.charAt(posiReal);
					
				}
			}
		}
		
		return cadenaCifrada;
		
	}
	
}
