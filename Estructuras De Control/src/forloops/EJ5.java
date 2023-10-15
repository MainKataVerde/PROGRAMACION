package forloops;

import java.util.Scanner;

public class EJ5 {

	public static void main(String[] args) {
		//VARIABLES
		int num , i , res;
		
		//NUMERO DEL USUARIO
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		//BUCLES PARA SACAR LOS NUMEROS DE FORA DESCENDIENTE
		for (i=num;i>0;i--) {
			System.out.println(i);
		}
	}

}
