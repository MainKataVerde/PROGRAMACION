package strch;

import java.util.Scanner;

public class EJ4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String frase = sc.nextLine();
		
		int num = frase.length()-1;	
		
		for(int i = num ; i >= 0 ;i--) {
			char result = frase.charAt(i);
			System.out.print(result);
			
		}
	}

}
