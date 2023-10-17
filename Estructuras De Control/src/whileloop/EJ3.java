package whileloop;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		int num , i , m ;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero = ");
		num = sc.nextInt();
		i=0;
		m=0;
		while(num!=0) {
			num=num/10;
			i++;
		}
		System.out.println("Tu numero tiene "+i+" digitos");
	}

}
