package whileloop;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		int num , i ;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		i=1;
		while(i<=num) {
			System.out.println(i);
			i++;
		}
	}

}
