package arrays2dimensiones;

import java.util.Scanner;

public class EJ4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int fila1 , columna1 ,fila2 , columna2 ,fila3 , columna3;

		
		int [][] arry1 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		
		
		boolean condicion = true ;
		
		System.out.println("Matriz original : ");
				
		for (int i = 0; i < arry1.length; i++) {
			for (int j = 0; j < arry1[i].length; j++) {
				System.out.print(arry1[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.print("Ingresa la posicion ( fila y columna ) para sumar :");
		
		while (condicion!=false) {
			fila1 = sc.nextInt();
			
			columna1 = sc.nextInt();
			
			if (fila1 < arry1.length -1 && fila1 > 0 && columna1 < arry1.length -1 && columna1 > 0 ) {
				System.out.print("Posicion Corecta");
			}else {
				System.out.print("Ingresa la posicion ( fila y columna ) para sumar :");
				
				fila1 = sc.nextInt();
				
				columna1 = sc.nextInt();
			}
			
			System.out.print("Ingresa la posicion ( fila y columna ) para sumar :");
			
			fila2 = sc.nextInt();
			
			columna2 = sc.nextInt();
			
			if (fila2 < arry1.length -1 && fila2 > 0 && columna2 < arry1.length -1 && columna2 > 0 ) {
				System.out.print("Posicion Corecta");
			}else {
				System.out.print("Ingresa la posicion ( fila y columna ) para sumar :");
				
				fila2 = sc.nextInt();
				
				columna2 = sc.nextInt();
			}
			
			System.out.print("Ingresa la posicion ( fila y columna ) para sumar :");
			
			fila3 = sc.nextInt();
			
			columna3 = sc.nextInt();
			
			if (fila3 < arry1.length -1 && fila3 > 0 && columna3 < arry1.length -1 && columna3 > 0 ) {
				System.out.print("Posicion Corecta");
			}else {
				System.out.print("Ingresa la posicion ( fila y columna ) para sumar :");
				
				fila3 = sc.nextInt();
				
				columna3 = sc.nextInt();
			}
			
			System.out.println("La suma es : " + arry1[fila1][columna1] + " " + arry1[fila2][columna2] + " " + arry1[fila3][columna3] + " = " + (arry1[fila1][columna1] + arry1[fila2][columna2] + arry1[fila3][columna3]));
			
			condicion = false;
		}
		
	}
	

}
