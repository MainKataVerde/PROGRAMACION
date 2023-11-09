package anidados;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		int i , j , num , acum2;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int acum = 1 ;
		for (i = 1 ; i <=num;i++) {
				for(j = 1 ; j <= i; j++) {
					System.out.print(j +" ");
			}
				System.out.println(" ");
		}
	}

}
