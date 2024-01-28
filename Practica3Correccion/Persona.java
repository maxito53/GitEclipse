package Practica3Correccion;

public class Persona {

	// Atributos
	
	String nombre, grupo;

	// Constructor
	
	public Persona(String nombre, String grupo) {
		this.nombre = nombre;
		this.grupo = grupo;
	}
	
	// Métodos
	
	@Override
	public String toString() {
		return String.format("%s (%s)", nombre, grupo);
		// return nombre+" ("+grupo+")"; // sin String.format
	}

}
