package switchej;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		//VARIABLE
		int num1 , num2 ;
		char op;
		//NUMEROS DE LOS USUSARIOS
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un numero");
		num1 = sc.nextInt();
		System.out.println("Dame un numero");
		num2 = sc.nextInt();
		System.out.println("Dame una operacion");
		op = sc.next().charAt(0);
		//CERRAMOS LOS SCANNERS
		sc.close();
		
		switch(op) {
			case '-':
				System.out.println(num1+"-"+num2+"="+(num1-num2));
			break;
			
			case '+':
				System.out.println(num1+"+"+num2+"="+(num1+num2));
			break;
			
			case '*':
				System.out.println(num1+"*"+num2+"="+(num1*num2));
			break;
			
			case '/':
				System.out.println(num1+"/"+num2+"="+(num1/num2));
			break;
		}
	}

}
