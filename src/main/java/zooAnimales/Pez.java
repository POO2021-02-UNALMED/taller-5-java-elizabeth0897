package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public int salmones;
	public int bacalaos;
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
	
	public void crearSalmon(String nombre, int edad, String genero) {
		new Pez(nombre,edad,"oceano",genero,"rojo",6);
		salmones++;
	}
	
	public void crearBacalao(String nombre,int edad, String genero) {
		new Pez(nombre,edad,"oceano",genero,"gris",6);
		bacalaos++;
	}
}