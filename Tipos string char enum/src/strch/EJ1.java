package strch;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		
		String frase = sc.nextLine();
										
		for(int i = 0 ; i <= (frase.length()-1);i++) {
			char result = frase.charAt(i);
			if(result=='a'||result=='A'){
				cont ++;
			}
		}
		System.out.println("Han salido = "+cont+" veces la a");
	}

}
