package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		listado.add(this);
	}
	
	public Reptil(String nombre,int edad,String habitat, String genero,String colorEscamas,int largoCola) {
		super(nombre,edad,habitat,genero);
		listado.add(this);
		this.colorEscamas  = colorEscamas;
		this.largoCola = largoCola;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public int getLargoCola() {
		return largoCola;
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	public String movimiento() {
		return ("reptar");
	}
	
	public static int cantidadReptiles() {
		return listado.size();
	}
	
	public void crearIguana(String nombre, int edad, String genero) {
		new Reptil(nombre,edad,"humedal",genero,"verde",3);
		iguanas++;
	}
	
	public void crearSerpiente(String nombre, int edad, String genero) {
		new Reptil(nombre,edad,"jungla",genero,"blanco",1);
		serpientes++;
	}
}