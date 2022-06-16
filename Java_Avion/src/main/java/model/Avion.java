package main.java.model;

import java.util.Scanner;

public class Avion {
	
	//------------ Atributos ------------
	private String idAvion;
	private Integer capacidad;
	private Integer numVuelos = 0;
	private Double kmVolados = 0.0;
	private String compania;
	
	
	//------------ Constructores ------------
	public Avion(String idAvion, Integer capacidad) {
		this.idAvion = idAvion;
		this.capacidad = capacidad;
	}
	
	
	public Avion(String idAvion, Integer capacidad, String compania) {
		this.idAvion = idAvion;
		this.capacidad = capacidad;
		this.compania = compania;
	}
	
	
	//------------ Metodos ------------
	/*Apartado a)*/
	public boolean asignarVuelo() {
		boolean sePuede = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos asientos van a estar ocupados en el avion? ");
		Integer asientosOcupados = Integer.valueOf(sc.nextLine());
		System.out.println("Asigna los kilometros que recorrera el avion: ");
		Double kilometros = Double.valueOf(sc.nextLine());
		
		if (asientosOcupados > capacidad) {
			System.out.println("Capacidad insuficiente.");
			
		}else {
			this.numVuelos += 1; 
			this.kmVolados += kilometros;
			sePuede = true;
		}
		
		return sePuede;
	}
	
	/*Apartado d)*/
	public Double obtenerMediaKilometrosVolados() {
		return (getKmVolados() / getNumVuelos());
	}
	
	/*Apartado e)*/
	public void cambiarCompania() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cual es la nueva compania del avion? ");
		String compania = String.valueOf(sc.nextLine());
		
		this.compania = compania;
	}
	
	
	//------------ Setters y getters ------------
	/*Apartado b)*/
	public Integer getNumVuelos() {
		return numVuelos;
	}
	

	/*Apartado c)*/
	public Double getKmVolados() {
		return kmVolados;
	}

	
	//------------ toString() ------------
	/*Apartado f)*/
	@Override
	public String toString() {
		return "Avion con ID " + idAvion + " de la compania " + compania + " ha realizado "
				+ numVuelos + " vuelo(s), con un total de " + kmVolados + " km y una media de "
				+ obtenerMediaKilometrosVolados() + " km por vuelo.";
	}
}
