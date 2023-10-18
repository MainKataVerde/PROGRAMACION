package whileloop;

import java.util.Scanner;

public class EJ4 {

	public static void main(String[] args) {
		//VARIABLES
		int num , al;
		Scanner sc = new Scanner(System.in);
		al = (int)(Math.random()*100-1+1)+1;
		System.out.println("Adivina un numero del 1 al 100");
		System.out.print("Inserte el numeor que crees que es =");
		num= sc.nextInt();
		//NUMERO ALEATORIO
		while(num!=al) {
			if(num<0||num>100) {
				System.out.print("Introduce un numero que entre dentro del rango = ");
				num= sc.nextInt();
			}else {
				if(num>al) {
					System.out.println("Te has pasado");
					System.out.print("Prueba otra vez = ");
					num= sc.nextInt();
				}else if (num<al) {
					System.out.println("Te has quedado corto");
					System.out.print("Prueba otra vez = ");
					num= sc.nextInt();
				}
			}
		}
		if (num == al) {
			System.out.println("Has ganado muy bien!!!");
		}
	}

}
