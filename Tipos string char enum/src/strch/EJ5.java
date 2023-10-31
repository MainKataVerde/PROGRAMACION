package strch;

import java.util.Scanner;

public class EJ5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserta una palabra y te diremos si es un palindormo o no");
		
		int cont = 0;
		
		String frase = sc.nextLine().replace(" ", "").toLowerCase();
				
		for(int i = (frase.length()-1) ; i >= 0 ;) {
				for(int j = 0 ; j <= (frase.length()-1) ; j++) {
					char resulta = frase.charAt(i);
					char resulta2 = frase.charAt(j);
					if (resulta == resulta2) {
						cont++;
					}
					i--;
				}
		}
		
		if (cont == frase.length()) {
			System.out.println("La palabra es palindromo");
		}else {
			System.out.println("La palabra no es palindromo");
		}
	}
}
