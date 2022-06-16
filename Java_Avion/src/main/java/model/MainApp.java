package main.java.model;

import java.util.Scanner;

public class MainApp {
	
	public static final String MENU_CON_OPCIONES = 
				"----------------------------------" + "\n"
			   + "Que vas a hacer con el avion creado? " + "\n" 
			   + "----------------------------------" + "\n"
			   + "a. Asignar vuelo" + "\n"
			   + "b. Obtener el numero de vuelos" + "\n"
			   + "c. Obtener el numero de kilometros" + "\n"
			   + "d. Obtener la media de kilometros por vuelo" + "\n"
			   + "e. Cambio de compania" + "\n"
			   + "f. Mostrar informacion del avion" + "\n"
			   + "g. Salir" + "\n"
			   + "----------------------------------";
	

	public static void main(String[] args) {

		menuCreacionAvion();
		
	}

	
	public static void menuCreacionAvion() {
		System.out.println("----------------------------------" + "\n"
						   + "Que vas a hacer? " + "\n" 
						   + "----------------------------------" + "\n"
						   + "1. Crear avion solo con identificador" + "\n"
						   + "2. Crear avion con el identificador y la compania" + "\n"
						   + "----------------------------------");
		System.out.println("Elige una opcion: ");
		Scanner sc = new Scanner(System.in);
		Integer eleccion = Integer.valueOf(sc.nextLine());
		
		if (eleccion == 1) {
			System.out.println("Identificador de avion: ");
			String identificador = String.valueOf(sc.nextLine());
			
			System.out.println("Capacidad del avion: ");
			Integer capacidad = Integer.valueOf(sc.nextLine());
			
			Avion avion = new Avion (identificador, capacidad);
			
			System.out.println("Avion creado con identificador y capacidad.");
			
			menuConOpciones(avion);
			
		}else if (eleccion == 2) {
			System.out.println("Identificador de avion: ");
			String identificador = String.valueOf(sc.nextLine());
				
			System.out.println("Capacidad del avion: ");
			Integer capacidad = Integer.valueOf(sc.nextLine());
			
			System.out.println("Compania del avion: ");
			String compania = String.valueOf(sc.nextLine());
				
			Avion avion = new Avion (identificador, capacidad, compania);
				
			System.out.println("Avion creado con identificador, capacidad y compania.");
			
			menuConOpciones(avion);
			
		}else {
			System.out.println("Te equivocaste, weon.");
		}
		
		sc.close();
		
	}
		
	
	public static void menuConOpciones(Avion avion) {
		
		Scanner sc2 = new Scanner(System.in);

		System.out.println(MENU_CON_OPCIONES);
		
		System.out.println("Elige una de las opciones: ");
		String eleccion2 = String.valueOf(sc2.nextLine());
		eleccion2 = eleccion2.toLowerCase();
		
		while (!eleccion2.equals("g")) {
			
			if (eleccion2.equals("a")) {
				avion.asignarVuelo();
				
			}else if (eleccion2.equals("b")) {
				System.out.println(avion.getNumVuelos());
				
			}else if (eleccion2.equals("c")) {
				System.out.println(avion.getKmVolados());
				
			}else if (eleccion2.equals("d")) {
				System.out.println(avion.obtenerMediaKilometrosVolados());
				
			}else if (eleccion2.equals("e")) {
				avion.cambiarCompania();
				
			}else if (eleccion2.equals("f")) {
				System.out.println(avion.toString());
				
			}
			
			System.out.println(MENU_CON_OPCIONES);
			System.out.println("Elige una de las opciones: ");
			eleccion2 = String.valueOf(sc2.nextLine());
			eleccion2 = eleccion2.toLowerCase();
		}
		
		System.out.println("Has salido del programa. Adios.");
		sc2.close();
	}
	
}
