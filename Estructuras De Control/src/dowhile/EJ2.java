package dowhile;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		//VARIABLES 
		int i , num , acum;
		//NUMERO DEL USUARIO
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		//DECLARAMOS LAS VARIABLES
		i=0;
		acum=0;
		//BUCLE
		do {
			//HACEMOS QUE SOLO SALGAN  LOS PARES
			i=i+2;
			//LOS SUMAMOS
			acum = acum+i;
			
			System.out.println(acum);
			
		}while(i<num);
	}

}
