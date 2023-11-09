package arrays;

public class EJ2 {

	public static void main(String[] args) {
		
		int numero[];
		
		int contador = 0;
		
		numero = new int[11];
		
		for (int i = 1; i <= numero.length-1;i++) {
		
			numero[i] = i;
			
			
			if ((i % 2) == 0) {
				contador++;
			}
			
			
			
	}
		
		System.out.println(contador);

	}

}
