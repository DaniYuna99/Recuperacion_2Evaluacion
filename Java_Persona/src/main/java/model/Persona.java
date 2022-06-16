package main.java.model;

public class Persona {

	//------------ Atributos ------------
	private String nombre;
	private int edad;
	private String dni;
	private Contrasena contrasena;
	private char sexo;
	private Double peso;
	private Double altura;
	
	//------------ Constructores ------------
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		/*this.dni = Generar*/
		/*this.contrasena = Generar*/
		this.sexo = 'M';
		this.peso = 0.0;
		this.altura = 0.0;
	}
	
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		/*this.dni = Generar*/
		/*this.contrasena = Generar*/
		this.sexo = sexo;
		this.peso = 0.0;
		this.altura = 0.0;
	}
	//------------ Metodos ------------
	//------------ Getters y setters ------------
	//------------ toString() ------------
}
