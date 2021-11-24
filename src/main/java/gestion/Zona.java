package gestion;

import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
	private String nombre;
	private Zoologico zoo; 
	private static ArrayList<Animal> animales = new ArrayList<Animal>(); 
	
	public Zona() { 
		
	}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public static void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Zoologico getZoo() {
		return zoo;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
}
