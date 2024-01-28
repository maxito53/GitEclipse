package Practica3Correccion;

public class Fraccio {

	// Atributos
	
	int numerador, denominador;

	// Constructor
	
	public Fraccio(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = (denominador == 0) ? 1 : denominador; // si denominador es 0, le asigno 1 (?), y sino (:) denominador
		/* 
		 if (denominador == 0)
		 	this.denominador = 1;
		 else 
		 	this.denominador = denominador;
		 */
	}
	
	// Métodos
	
	public Fraccio resta(Fraccio otra) {
		
		int numResultado = numerador * otra.denominador - otra.numerador * denominador;
		int denResultado = denominador * otra.denominador;
		
		Fraccio resultado = new Fraccio(numResultado, denResultado);
		resultado.simplifica();
		return resultado;
		
	}
	
	public Fraccio multiplicaPor(Fraccio otra) {
		
		int numResultado = numerador * otra.numerador;
		int denResultado = denominador * otra.denominador;
		
		Fraccio resultado = new Fraccio(numResultado, denResultado);
		resultado.simplifica();
		return resultado;
		
	}
	
	public Fraccio dividirPor(Fraccio otra) {
		
		int numResultado = numerador * otra.denominador;
		int denResultado = denominador * otra.numerador;
		
		Fraccio resultado = new Fraccio(numResultado, denResultado);
		resultado.simplifica();
		return resultado;
		
	}
	
	private int mcd() {
		
		int min = Math.min(numerador, denominador);
		
		int mcd = 1;
		for (int i=2 ; i<=min ; i++) {
			
			if ((numerador % i == 0) && (denominador % i == 0)) {
				mcd = i;
			}
		}
		
		return mcd;
		
	}
	
	public void simplifica() {
		
		int mcd = mcd();
		
		numerador /= mcd;
		denominador /= mcd;
		
	}
	
	@Override
	public String toString() {
		return String.format("(%d/%d)", numerador, denominador);
	}
	
	
}
