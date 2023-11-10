package arrays;

import java.util.Scanner;

public class EJ5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int buscar , alt ; 
		
		int mi_array[];
		
		mi_array = new int[11];
		
		System.out.print("Elige la casilla que quieras eliminar : ");

		buscar = scanner.nextInt();
		
		System.out.print("Array original : ");
		
		for(int i = 0 ; i < mi_array.length;i++) {	
			alt = (int)(Math.random()*10+1);
			mi_array[i] = alt;
			System.out.print(mi_array[i] + " ");
		}
		
		System.out.print("\nDespues de eliminar el elemento "+mi_array[buscar]+" : ");
		
		for(int k = 0 ; k < mi_array.length; k++) {
			System.out.print(mi_array[k] + " ");
			
			if(k == buscar) {
				mi_array[k] = mi_array[k+1]; 
			}
		}
		
	}
	

}
