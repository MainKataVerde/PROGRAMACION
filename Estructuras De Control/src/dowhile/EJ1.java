package dowhile;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		//VARIABLE
		int num , i,res;
		//NUMERO DEL USUARIO
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		i=1;
		
		//BARIABLE
		do {
			res= num*i;
			System.out.println(num+"*"+i+"="+res);
			i++;
		}while(i<=10);
	}

}
