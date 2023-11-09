package anidados;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		int i , j , num , cont;
		String ast="*";
		String ast2="";
		Scanner sc = new Scanner(System.in);
		cont=0;
		num = sc.nextInt();
		
		for (i = 1 ; i <=num;) {
				for(j = 1 ; j <= num; j++) {
					ast2=ast2+ast;
					System.out.println(ast2);
					i++;
			}
		}
	}

}
