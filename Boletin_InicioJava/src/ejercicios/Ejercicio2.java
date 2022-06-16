package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	/*2. Escribe un método que reciba por parámetro el día 
	 * de la semana (Lunes, Martes, Miércoles, etc) y devuelva 
	 * qué asignatura toca a primera hora ese día.*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuál es el día del cuál quieres saber la asignatura "
				+ "a primera hora? (Pon Lunes, Martes...)");
		String dia = String.valueOf(sc.nextLine());
		
		System.out.println(asignaturaAPrimeraHora(dia));
		
		sc.close();
	}
	
	
	public static String asignaturaAPrimeraHora(String dia) {
		String asignatura = "";
		String diaSemana = dia.toUpperCase();
		
		if (diaSemana.equals("LUNES")) {
			asignatura = "La asignatura que toca a primera hora el " 
						+ dia + " es Sistemas informáticos.";
			
		} else if (diaSemana.equals("MARTES")) {
			asignatura = "La asignatura que toca a primera hora el " 
						+ dia + " es Programación."; 
			
		} else if ((diaSemana.equals("MIÉRCOLES") || (diaSemana.equals("JUEVES") 
				|| (diaSemana.equals("VIERNES") || (diaSemana.equals("MIERCOLES")))))) {
			asignatura = "La asignatura que toca a primera hora el " 
						+ dia + " es Bases de Datos.";
		} else {
			asignatura = "Te has equivocado al poner el día de la semana.";
		}
		
		return asignatura;
	}

}
