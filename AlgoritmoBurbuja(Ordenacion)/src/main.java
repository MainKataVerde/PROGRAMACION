/**
 * @author Oscar
 */
public class main {
	
	/**
	 * Aqui se van a ejecitar todos los metodos
	 * @param args
	 */

	public static void main(String[] args) {
		
		int mi_array[] = new int [(int)(Math.random()*30+1)];
				
		System.out.println("Antes de ordenar :");
		
		aleatorio(mi_array);
		
		imprimir(mi_array);
		
		System.out.println();
		System.out.println();
				
		System.out.println("Despues de ordenar :");
					
		Ordenacion(mi_array);
		imprimir(mi_array);
				
	}
	
	/**
	 * Rellena una array con numero aleatorio
	 * @param mi_array
	 */
	
	public static void aleatorio(int[] mi_array) {
		int alt ;
		for (int i = 0 ; i < mi_array.length ; i ++){
			
			alt = (int)(Math.random()*100+1);

			mi_array[i] = alt;
		}
		
	}
	
	/**
	 * Ordena cualquier array con el algoritmo de la burbuja
	 * @param mi_array
	 */
	
	public static void Ordenacion(int[] mi_array) {
		int acum ;
		for (int i = 0; i < mi_array.length; i++) {
			for (int j = 0; j < (mi_array.length - i - 1); j++) {
				
				if (mi_array[j] > mi_array[j + 1 ]) {
					
					acum = mi_array[j + 1];
					
					mi_array[j + 1 ] = mi_array[j];
					
					 mi_array[j] = acum;
					
				}
			}
			
		}
		
	}
	
	/**
	 * Imprime la array que le pongamos de parametro 
	 * @param mi_array
	 */
	public static void imprimir(int[] mi_array) {
		for (int i = 0; i < mi_array.length; i++) {
			System.out.print(mi_array[i]+" ");
		}
	}
	
	
}
