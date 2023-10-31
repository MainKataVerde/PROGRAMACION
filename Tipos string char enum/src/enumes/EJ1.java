package enumes;

import java.util.Scanner;

/**
 * Clase Ej01. Crea un enum llamado DiaSemana que represente los dıas de la semana 
 * (Lunes, Martes, Miercoles, etc.). Luego, el programa solicita al usuario un numero y muestra 
 * el dıa correspondiente.
 * @author crisuroll
 */

public class EJ1 {
	
	/**
	 * Metodo main
	 * @param args
	 */
	
	public enum DiaSemana {
		LUNES,
		MARTES,
		MIERCOLES,
		JUEVES,
		VIERNES,
		SABADO,
		DOMINGO;
	}

	public static void main(String[] args) {
		
		DiaSemana dia;
		DiaSemana dias [] = DiaSemana.values();
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int num = sc.nextInt();
		
		if (num >= 1 || num <= dias.length) {
			dia = dias[num-1];
			System.out.println("Hoy es " + dia);
		} else {
			System.out.println("Sólo puedes ingresar un número del 1 al 7.");
		}
		

	}

}
