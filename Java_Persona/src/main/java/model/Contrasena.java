package main.java.model;

public class Contrasena {

	//------------ Atributos ------------
	private int longitud = 8;
	private String contrasena;
	
	
	//------------ Constructores ------------
	public Contrasena (String contrasena) {
		this.contrasena = contrasena;
		//Debe generar aleatoriamente una contrasena
	}
	
	
	public Contrasena (int longitud) {
		//Debe generar aleatoriamente 
		//una contrasena con la longitud suministrada
	}
	
	
	//------------ Metodos ------------
	public boolean esFuerte() {
		boolean esTocha = false;
		int contadorMayus = 0;
		int contadorMinus = 0;
		int contadorNumeros = 0;
		
		if (contrasena.length() >= longitud) {
			
			for (int i = 0; i < contrasena.length(); i++) {
				if (Character.isDigit(contrasena.charAt(i)) == true) {
					contadorNumeros++;
				}else if (Character.isLowerCase(contrasena.charAt(i)) == true) {
					contadorMinus++;
				}else if (Character.isUpperCase(contrasena.charAt(i)) == true) {
					contadorMayus++;
				}
			}
			
			if (contadorNumeros >= 5 && contadorMinus >= 1 && contadorMayus >= 2) {
				esTocha = true;
			}
			
		}
		
		return esTocha;
	}
	
	
	public void generarContrasena() {
		String contrasena = "";
		//Generar aleatoriamente, y settearla
		this.contrasena = contrasena;
	}

	
	
	//------------ Getters y setters  ------------
	public int getLongitud() {
		return longitud;
	}


	public String getContrasena() {
		return contrasena;
	}
	
	
	
	
	
	
	
	
	
	


	
}
