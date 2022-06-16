package ejercicios;

public class Ejercicio18 {

	public static void main(String[] args) {

		/*18. Escribe los números del 320 al 160, contando de 20 en 20 
		 * utilizando un bucle do-while.*/
		
		int contador = 320;
		
		do {
			System.out.println(contador);
			contador = contador - 20;
			
		}while (contador >= 160);
	}

}
