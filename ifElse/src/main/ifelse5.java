package main;

import java.util.Scanner;

public class ifelse5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
	
		if(num<1||num>100) {
			System.out.println("Esta fuera del rango");
		}else {
			System.out.println("Esta dentro del rango");
		}
	}

}
