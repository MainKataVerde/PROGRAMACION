package arrays;

import java.util.Scanner;

public class EJ4 {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		int buscar , cont , resultado , alt;
				
		cont = 0 ;
		
		resultado = 0 ;
		
		int num[];
		
		num= new int[11];
		
		System.out.print("¿Que numero quieres buscar? ");
		
		buscar = scanner.nextInt();
				
	for (int i = 1; i < num.length;i++) {
			alt = (int)(Math.random()*10+1);
			num[i]= alt;
			cont++;
			System.out.println(num[i]);
			if(buscar==num[i]) {
				resultado = cont;
			}
		}
	
		if(resultado>0) {
			System.out.println("Tu numero esta en la posicion "+resultado);
		}else {
			System.out.println("Su numero no se encontro");
		}
	}

}
