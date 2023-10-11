package main;

import java.util.Scanner;

public class ifelse3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int res = num%2;
		
		if(res==0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
			
		}
	}

}
