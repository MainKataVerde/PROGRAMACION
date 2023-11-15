package arrays;

import java.util.Scanner;

public class EJ6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int [] mi_array1 = {25 , 20 , 400 , 1 , 2 }; 
		
		System.out.print("Introduce la posicion del elemento : ");
		
		int posicion = scanner.nextInt();
		
		System.out.print("Introduce el elemento : ");
		
		int elemento = scanner.nextInt();
		
		System.out.print("Array original : " + mi_array1[0]+ " "+ mi_array1[1]+ " "+ mi_array1[2]+ " "+ mi_array1[3]+ " "+ mi_array1[4]+ " ");
		
		
		if (posicion <0 || posicion > mi_array1.length) {
			System.err.println("Introduce una posicion ");
		}else {
			posicion = posicion - 1 ;
			mi_array1[posicion] = elemento;			
			for(int m = posicion+1 ; m < mi_array1.length-1;m++) {
				mi_array1[m] = mi_array1 [m+1];
			}
		}
		
		
		System.out.print("\nNuevo array : " + mi_array1[0]+ " "+ mi_array1[1]+ " "+ mi_array1[2]+ " "+ mi_array1[3]+ " "+ mi_array1[4]+ " ");

		
		
		
	}

}
