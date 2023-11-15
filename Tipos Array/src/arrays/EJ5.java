package arrays;

import java.util.Scanner;

public class EJ5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				
		int [] mi_array1  = {3,71,40,10,20};
		
		System.out.print("Elige la casilla que quieras eliminar : ");

		int buscar = scanner.nextInt();
		
		System.out.print("Array original : " + mi_array1[0]+ " "+ mi_array1[1]+ " "+ mi_array1[2]+ " "+ mi_array1[3]+ " "+ mi_array1[4]+ " ");
		
		if (buscar<0||buscar>mi_array1.length-1) {
			System.err.println("Introduce un numero valido");
		}else {
			buscar = buscar -1 ;
			for(int i = buscar ; i < mi_array1.length-1; i++ ) {
				mi_array1[i] = mi_array1[i+1];
			}
		}
		
		System.out.print("\nDespues de quitar la posicion "+buscar+" : " + mi_array1[0]+ " "+ mi_array1[1]+ " "+ mi_array1[2]+ " "+ mi_array1[3]+ " "+ mi_array1[4]+ " ");
		
	}
	

}
