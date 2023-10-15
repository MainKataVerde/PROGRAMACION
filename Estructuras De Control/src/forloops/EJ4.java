package forloops;

import java.util.Scanner;

public class EJ4 {

	public static void main(String[] args) {

		//VARIABLES
		int num , i , res;
		
		//NUMERO DEL USUARIO
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		for (i=1;i<=10;i++) {
			
			res = num*i;
			
			System.out.println(num+"*"+i+"="+res);
		}
	}

}
