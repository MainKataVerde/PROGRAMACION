package arrays;


public class EJ1 {

	public static void main(String[] args) {
		
		int numero[];
		
		int resultado = 0;
		
		numero = new int[10];
		
		for (int i = 1; i <= numero.length-1;i++) {
		
			numero[i] = i;
			
			System.out.println(numero[i]);
			
			resultado+=i;
			
	}
		
		System.out.println(resultado);

}
}
