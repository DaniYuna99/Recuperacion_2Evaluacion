package ejercicios;

public class Ejercicio15 {

	public static void main(String[] args) {

		/*15. Realiza un programa que muestre los números múltiplos 
		 * de 5 de 0 a 100 utilizando un bucle do-while.*/
		
		int contador = 0;
		
		do {
			System.out.println(contador);
			contador = contador + 5;
			
		}while (contador <= 100);
	}

}
