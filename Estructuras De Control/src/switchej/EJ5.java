package switchej;

import java.util.Scanner;

public class EJ5 {

	public static void main(String[] args) {
		int num ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nota del 1 al 5");
		num = sc.nextInt();
		
		sc.close();
		if(num<1||num>5) {
			System.out.println("Introduce una nota dentro del rango");
		}else {
			switch(num) {
			case 1 : 
			case 2 :
				System.out.println("Suspenso");
			break;
			case 3 : 
				System.out.println("Bien");
			break;
			case 4:
				System.out.println("Notable");
			break;
			case 5 :
				System.out.println("Sobresaliente");
			break;		
		}
	}

}
}