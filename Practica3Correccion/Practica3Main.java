package Practica3Correccion;

import java.util.Scanner;

public class Practica3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		// EJERCICIO 1: GUSTOS MUSICALS --------------------------------------------------
		
		System.out.println("De quantes persones agafo dades? ");
		int numPersonas = Integer.parseInt(entrada.nextLine());
		
		Persona[] personas = new Persona[numPersonas]; // creo la array
		
		System.out.println("\n** Recollida de dades **");
		
		for (int i=0 ; i<personas.length ; i++) {
			System.out.printf("\nPersona %d: Introdueix el nom: ", i+1);
			String nombre = entrada.nextLine();
			
			System.out.printf("Persona %d: Introdueix el grup musical preferit: ", i+1);
			String grupo = entrada.nextLine();
			
			personas[i] = new Persona(nombre, grupo);
		}
		
		System.out.println("\n** Dades recollides **");
		
		for (int i=0 ; i<personas.length ; i++) {
			System.out.printf("%d: %s%n", i+1, personas[i]);
		}
		
		// EJERCICIO 2: OPERAR AMB FRACCIONS ---------------------------------------------
		
		Fraccio f1 = new Fraccio(2,3); // 2/3
		Fraccio f2 = new Fraccio(1,2); // 1/2
		
		System.out.printf("%s - %s = %s\n", f1, f2, f1.resta(f2));
		System.out.printf("%s * %s = %s\n", f1, f2, f1.multiplicaPor(f2));
		System.out.printf("%s / %s = %s\n", f1, f2, f1.dividirPor(f2));

		// EJERCICIO 3: ÍTEMS D'UN JOC ---------------------------------------------------
		
		Item[] inventario = {
				new Item("Poció màgica", 0.1, 10),
				new Item("Patates", 0.5, 1),
				new Item("Roba de carrer", 2, 5)
		};
		
		System.out.println("Inventari:");
		
		int valorTotal = 0;
		double pesoTotal = 0;
		
		for (Item item : inventario) { // sintatxi "for each"
			valorTotal += item.valor;
			pesoTotal += item.peso;
			System.out.println("  " + item); // también item.toString()
		}
		
		System.out.printf("  Total. %d ítems (%.1fkg %d🪙)", inventario.length, pesoTotal, valorTotal);
		
		entrada.close();
	}

}
