package arrays;


public class EJ1 {

	public static void main(String[] args) {
		
		int numero[];
		
		int resultado = 0;
		
		numero = new int[11];
		
		for (int i = 0; i <= numero.length-1;i++) {
		
			numero[i] = i;
			
			System.out.println(numero[i]);
			
			resultado+=i;
			
	}
		
		System.out.println(resultado);

}
}
