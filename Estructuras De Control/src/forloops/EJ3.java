package forloops;

import java.util.Scanner;

public class EJ3 {
	/*
	 * Solicita al usuario que ingrese un numero entero positivo y luego calcula su
		factorial utilizando un bucle for.
		Solo pueden ser numeros positivos pq no se puden sacar factoriales de numeros 
		negativos
	 */

	public static void main(String[] args) {
		//VARTABLES
		int i , num , fac;
		
		//NUMERO DE USUSARIO
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		//CONTROLADOR DE ENTRADA (SOLO POSITIVOS)
		if(num<0){
			System.out.println("Inserte un numero valido");
		}else{

			fac = 1;
			//BUCLE PARA OPERACION DE NUMEROS FACORIALES
			for(i=1;i<=num;i++) {
				
				//ECUACION NUMEROS FACTORIARES
				fac = fac*i;

				
				System.out.println(fac);				
			}
			
		}
	}

}
