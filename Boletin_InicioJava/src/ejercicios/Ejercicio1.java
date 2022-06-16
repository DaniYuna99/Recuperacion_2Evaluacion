package ejercicios;

public class Ejercicio1 {

	/*1. Realizar un método que reciba dos números 
	 * y devuelva True si uno es múltiplo del otro.*/
	
	public static void main(String[] args) {

		System.out.println(comprobarMultiplos(3,9));	 //True
		System.out.println(comprobarMultiplos(10,200));  //True
		System.out.println(comprobarMultiplos(4,11));	 //False
		System.out.println(comprobarMultiplos(20,301));  //False
		
	}

	public static boolean comprobarMultiplos (int n1, int n2) {
		boolean esMultiplo = false;
		
		if (n2 % n1 == 0) {
			esMultiplo = true;
		}
		
		return esMultiplo;
	}
}
