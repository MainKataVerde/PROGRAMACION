package forloops;

import java.util.Scanner;

public class EJ1 {
	/*
	 * Buclle que muestras los numero desde el 1 hasta que el numero que nos de el usuario
	 */

	public static void main(String[] args) {
		//variables
		
		int i ,num; 
		//cogemos los datos que nos de el usuario
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		// creamos el bubles necesario para hacer el ejercicio
		
		for (i = 1; i<num ; i++) {
			System.out.println(i);
			i=i+1;
			System.out.println(i);

		}
	}

}
