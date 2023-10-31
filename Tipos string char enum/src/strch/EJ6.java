package strch;

import java.util.Scanner;

public class EJ6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Infrese una cadena de texto : ");
		
		String frase = sc.nextLine();
		
		System.out.print("Infrese el caracter a buscar : ");
		
		char pc = sc.next().charAt(0);
		
		System.out.print("Infrese el caracter por el que lo quieres cambiar : ");
		
		char pc2 = sc.next().charAt(0);
		
		String renplazo = frase.replace(pc, pc2);
		
		System.out.println(renplazo);
		
	}

}
