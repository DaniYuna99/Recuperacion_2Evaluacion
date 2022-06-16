package main.java;

import main.java.model.Contrasena;

public class MainApp {

	public static void main(String[] args) {

		Contrasena contrasena = new Contrasena("ABa20000");
		System.out.println(contrasena.esFuerte());
	}

}
