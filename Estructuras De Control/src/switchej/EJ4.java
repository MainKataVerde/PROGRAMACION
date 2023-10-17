package switchej;

import java.util.Scanner;

public class EJ4 {

	public static void main(String[] args) {
		//VARABLES
		int num ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Mostras informacio (1) || Editar perfil (2) || Salir (3)");
		num = sc.nextInt();
		
		switch(num) {
			
			case 1 :
				System.out.println("Hola estas dentro de tu informacion");
			break;
			case 2 :
				System.out.println("Aqui puedes editar tu perfil");
			break;
			case 3 :
				System.out.println("Adios hasta pronto");
			break;
		}
		
	}

}
