package main;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Itroduce la nota de tu examen");

		int nt = sc.nextInt();
		
		if (nt>=60) {
			System.out.println("Aprovado");

		}else {
			System.out.println("Suspenso");
		}
	}

}
