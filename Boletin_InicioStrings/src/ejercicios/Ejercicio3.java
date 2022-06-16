package ejercicios;

public class Ejercicio3 {

	public static final String ABECEDARIO = "abcdefghijklmnñopqrstuvwxyz";

	public static void main(String[] args) {

		/*3. Crea otra funcion que utilice la anterior para codificar una palabra o texto.*/
		
		System.out.println(cifradoCesar("casado", 3));
		
	}
	
	
	public static String cifradoCesar(String cadena, int posicion) {
		
		String cadenaCifrada = "";
		cadena = cadena.toLowerCase();
		int posiReal = 0;
		
		for (int i = 0; i < cadena.length(); i++) {
			
			for (int j = 0; j < ABECEDARIO.length(); j++) {
				
				if (cadena.charAt(i) == ABECEDARIO.charAt(j)) {
					posiReal = ABECEDARIO.indexOf(cadena.charAt(i)) + posicion;
					
					if (posiReal > (ABECEDARIO.length()) - 1) {
						posiReal = posiReal - ABECEDARIO.length();
					}
					
					cadenaCifrada += ABECEDARIO.charAt(posiReal);
					
				}
			}
		}
		
		return cadenaCifrada;
		
	}
	
	/*ESTO FUE INNECESARIO, PERO LO DEJO AQUI*/
	/*public static String descodificarPalabra(String palabraSin, String palabraCifrada) {
		String palabraMinus = palabraSin.toLowerCase();
		String palabraCifradaMinus = palabraCifrada.toLowerCase();
		String palabra = "";
		String resultado = "";
		
		for (int i = 0; i < ABECEDARIO.length(); i++) {
			palabra = cifradoCesar(palabraMinus, i);
			
			if (palabra.equals(palabraCifradaMinus)) {
				resultado = "La palabra " + palabraSin + " se convierte en " 
							+ palabraCifrada + " si se le somete a un nivel " 
							+ i + " de sustitucion.";
			}else {
				resultado = "La palabra " + palabraSin + " no se convierte en " 
							+ palabraCifrada + ".";
			}
		}
		
		
		return resultado;
	}*/

}
