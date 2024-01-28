package Practica3Correccion;

public class Item {

	// Atributos
	
	public String nombre;
	public double peso;
	public int valor;

	// Constructor

	public Item(String nombre, double peso, int valor) {
		this.nombre = nombre;
		this.peso = peso;
		this.valor = valor;
	}

	// Métodos
	
	@Override
	public String toString() {
		return String.format("[Item] %s (%.1fkg %d🪙)", nombre, peso, valor);
	}
	
}
