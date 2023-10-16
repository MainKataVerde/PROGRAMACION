package ifelse;

import java.util.Scanner;

public class EJ5 {

	public static void main(String[] args) {
		//variables
		int num , rg1 , rg2;
		
		Scanner sc = new Scanner(System.in);
		//sacamos los numeros de los usuarios 
		num = sc.nextInt();
		// decalaramos la variable de rango 
		rg1 = 1 ;
		rg2 = 100;
	//si el numero esta entre el rango pone un mensaje si no esta entre el rango 
	//utilizamos un and pq se tienen que cumplir las 2 condiciones
		if(num<rg1||num>rg2) {
			System.out.println("Esta fuera del rango");
		}else {
			System.out.println("Esta dentro del rango");
		}
		
		sc.close();
	}

}
