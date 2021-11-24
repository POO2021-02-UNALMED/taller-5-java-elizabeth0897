package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
		
	public Mamifero() {
		listado.add(this);
	}
	
	public Mamifero(String nombre,int edad,String habitat, String genero,boolean pelaje,int patas) {
		super(nombre,edad,habitat,genero);
		listado.add(this);
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	public void crearCaballo(String nombre,int edad,String genero) {
		new Mamifero(nombre,edad,"pradera",genero,true,4);
		caballos++;
	}
	
	public void crearLeon(String nombre, int edad, String genero) {
		new Mamifero(nombre,edad,"selva",genero,true,4);
		leones++;
	}
	
	public boolean getPelaje() {
		return pelaje;
	}
	
	public int getPatas() {
		return patas;
	}
	
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
}	