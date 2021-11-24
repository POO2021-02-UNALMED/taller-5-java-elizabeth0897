package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	public Ave() {
		listado.add(this);
	}
	
	public Ave(String nombre,int edad,String habitat, String genero, String colorPlumas ) {
		super(nombre,edad,habitat,genero);
		listado.add(this);
		this.colorPlumas = colorPlumas;
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}
	
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	public String movimiento() {
		return ("volar");
	}
	
	public static int cantidadAves() {
		return listado.size();
	}
	
	public void crearHalcon(String nombre, int edad, String genero) {
		new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
		halcones++;
	}
	
	public void crearAguila(String nombre, int edad, String genero) {
		new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
		aguilas++;
	}
}	