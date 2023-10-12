package forloops;

import java.util.Scanner;

public class EJ2 {
	/*
	 * Sacaremos un numero del usuario y haremos una suma de todos los numeros pares 
	 * de el numero del usuario mas los pares
	 */

	public static void main(String[] args) {
		//variables
		int i , num , res ;
		
		//sacamos el numero del usuario
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		//bucle for para sacar el calculo
		for(i=1; i<=num;i++) {
			i++;
			res=i+num;
			System.out.println(i+"+"+num+"="+res);
		}
	}

}
