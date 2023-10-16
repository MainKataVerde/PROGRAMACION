package ifelse;

import java.util.Scanner;

public class EJ3 {
	/*
	 * Programa que analiza el nuemero que le da el usuario 
	 * y te dice si es un numero par o impar 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//variables
		int num , res;
		//sacamos el numero del ususario con el scanner
		num = sc.nextInt();
		//ahora si un numero es divisible entre dos el resto es 0 asi que eso quiere decir q es par
		res = num%2;
		//si el resto es 0 es decir si es dibisible entre dos quiere decir que es par 
		if(res==0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
			
		}
		sc.close();
	}

}
