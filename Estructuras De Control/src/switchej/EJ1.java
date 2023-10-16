package switchej;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		//VARIABLES
		int num ;
		//NUMERO DEL USUSARIO
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		switch (num) {
			case 0 :
				System.out.println("Lunes");
			break;
			
			case 1 :
				System.out.println("Martes");
			break;
			
			case 2 :
				System.out.println("Miercoles");
			break;
			
			case 4 :
				System.out.println("Jueves");
			break;
			
			case 5 :
				System.out.println("Viernes");
			break;
			
			case 6 :
				System.out.println("Sabado");
			break;
			
			case 7 : 
				System.out.println("Domingo");
			break;

		}
	}

}
