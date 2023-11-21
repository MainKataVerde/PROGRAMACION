package arrays;

import java.util.Arrays;

public class EJ7 {

	public static void main(String[] args) {
		
		int [] mi_array1 = {5,2,5,7,8,8,8,8,7,6,5,5,5,2};
		
		System.out.print("Array con repeticiones : ");
		
		for(int k = 0 ; k < mi_array1.length - 1 ; k ++ ) {
			System.out.print(mi_array1[k] + " ");
		}
		
		System.out.print(mi_array1[mi_array1.length - 1]);
		
		//metodo para ordenadar de menos a mayor lo elemntode la array
		Arrays.sort(mi_array1);
		
		System.out.println("\n");
			
		System.out.print("Array sin duplicados : ");
		
		int [] mi_array2 = new int[mi_array1.length];
		
		
		int acum = 0;
		// si el primero es diferente del segundo lo guarda en la array nueva
		for (int i = 0 ; i < mi_array1.length - 1 ; i ++) {
			if (mi_array1[i] != mi_array1[i + 1]) {
				mi_array2 [acum ++] = mi_array1[i];
			}
		}
		//el ultimo numero no se almacena pq no tienen nada con que comparlo asi que lo tenmos que sacar nosotros
		mi_array2[acum ++] = mi_array1[mi_array1.length - 1];
		
		//imprimimos el resultado
		for(int j = 0 ; j < acum ; j ++) {
			System.out.print(mi_array2[j] + " ");
		}
		
		
		
	}

}
