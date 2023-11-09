package condicioneslogicas;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		System.out.println("Introduce un numero y te dire si estan en orden decreciente o creciente");
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3;
		System.out.print("Introduce el primer numero = ");
		num1 = sc.nextInt();
		System.out.print("Introduce el segundo numero = ");
		num2 = sc.nextInt();
		System.out.print("Introduce el tercer numero = ");
		num3 = sc.nextInt();
		
		sc.close();
		
		if (num1>num2 && num2>num3) {
			System.out.println("Estan en orden creciente");
		}else if (num3>num2 && num3>num1) {
			System.out.println("Estan en orden decreciente");
		}else {
			System.out.println("No esta ni en orden creciente ni en orden decreciente");
		}
	}

}
