package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList <Anfibio> listado = new ArrayList<>();
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		listado.add(this);		
	}
	
	public Anfibio(String nombre,int edad,String habitat, String genero,String colorPiel,boolean venenoso) {
		super(nombre,edad,habitat,genero);
		listado.add(this);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	
	public boolean getVenenoso() {
		return venenoso;
	}
	
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public String movimiento() {
		return ("saltar");
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	public void crearRana(String nombre, int edad, String genero) {
		new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		ranas++;
	}
	
	public void crearSalamandra(String nombre, int edad, String genero) {
		new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
		salamandras++;
	}
}