package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		listado.add(this);
	}
	
	public Pez(String nombre,int edad,String habitat, String genero,String colorEscamas, int cantidadAletas) {
		super(nombre,edad,habitat,genero);
		listado.add(this);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public int getCantidadAletas() {
		return cantidadAletas;
	}	
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	public String movimiento() {
		return ("nadar");
	}
	
	public static int cantidadPeces() {
		return listado.size();
	}
	
	public static void crearSalmon(String nombre, int edad, String genero) {
		new Pez(nombre,edad,"oceano",genero,"rojo",6);
		salmones++;
	}
	
	public static void crearBacalao(String nombre,int edad, String genero) {
		new Pez(nombre,edad,"oceano",genero,"gris",6);
		bacalaos++;
	}
}