package condicioneslogicas;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		System.out.println("Introduce un numero y te dire cual es mayor");
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3;
		System.out.print("Introduce el primer numero = ");
		num1 = sc.nextInt();
		System.out.print("Introduce el segundo numero = ");
		num2 = sc.nextInt();
		System.out.print("Introduce el tercer numero = ");
		num3 = sc.nextInt();
		
		sc.close();
		
		if ((num1-num2-num3)>=0) {
			System.out.println("El mas grande es el primero");
		}else if ((num2-num3)>=0 && (num2-num1)>=0) {
			System.out.println("El mas grande es el segundo");
		}else if ((num3-num2)>=0 && (num3-num1)>=0) {
			System.out.println("El mas grande es el tercero");
		}
	}

}
