package ejercicios;

public class Ejercicio4 {

	/*4. Calcular las calificaciones de un alumno con un método 
	que reciba la nota de la parte práctica, la nota de los 
	problemas y la parte teórica. La nota final se calcula según el
	siguiente criterio: la parte práctica vale el 10%; la parte 
	de problemas vale el 50% y la parte teórica el 40%. Las notas 
	deben estar entre 0 y 10, si no lo están, deberá devolver un
	mensaje de error. Realiza el método que calcule la media de tres 
	notas y te devuelva la nota del boletín (insuficiente, suficiente, 
	bien, notable o sobresaliente)*/
	
	public static void main(String[] args) {

		System.out.println(calcularCalificaciones(9,1,10));
	}

	public static String calcularCalificaciones (int notaPractica, 
			int notaProblemas, int notaTeorica) {
		
		int notaFinal = 0;
		String evaluacion = "";
		
		if ((notaPractica >= 0 && notaPractica <= 10) 
				&& (notaProblemas >= 0 && notaProblemas <= 10)
				&& (notaTeorica >= 0 && notaTeorica <= 10)) {
			
			notaPractica = (notaPractica * 10) / 100;
			notaProblemas = (notaProblemas * 50) / 100;
			notaTeorica = (notaTeorica * 40) / 100;
			
			notaFinal = (notaPractica + notaProblemas + notaTeorica);
			
			if ((notaFinal > 0) && (notaFinal <= 4)) {
				evaluacion = "Insuficiente.";
			}else if (notaFinal == 5) {
				evaluacion = "Suficiente.";
			}else if (notaFinal == 6) {
				evaluacion = "Bien.";
			}else if ((notaFinal > 6) && (notaFinal < 9)) {
				evaluacion = "Notable.";
			}else if ((notaFinal == 9) || (notaFinal == 10)) {
				evaluacion = "Sobresaliente.";
			}
			
		}else {
			evaluacion = "Ha ocurrido un error. "
					+ "Alguna de las notas introducidas es incorrecta.";
		}
		
		
		return evaluacion;
	}
}
