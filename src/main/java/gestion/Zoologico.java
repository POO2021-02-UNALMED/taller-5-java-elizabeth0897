package gestion;

import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private static ArrayList<Zona> zonas = new ArrayList<Zona>(); 
	
	public Zoologico() {
		
	}
	
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public static int cantidadTotalAnimales(){
			int contador = 0;
			for (int i=0;i<zonas.size();i++) {
				contador += zonas.get(i).cantidadAnimales();
			}
			return contador;
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
}