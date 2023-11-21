package arrays2dimensiones;


public class EJ1 {

	public static void main(String[] args) {
		
		int [][] arry1 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int [][] arry2 = {
				{9,8,7},
				{6,5,4},
				{3,2,1}
		};
		
		int suma [][];
		
		suma = new int [3][3];
		
		System.out.println("Matriz 1 : \n");
		
		for (int i = 0 ; i < arry1.length; i++) {
			for(int j = 0 ; j < arry1[i].length; j ++) {
				System.out.print (arry1[i][j]+" ");
			}
			System.out.println("\n");
		}
		
		System.out.println("Matriz 2 : \n");

		
		for (int i = 0 ; i < arry2.length; i++) {
			for(int j = 0 ; j < arry2[i].length; j ++) {
				System.out.print (arry2[i][j]+" ");
			}
			System.out.println("\n");
		}
		
		System.out.println("Matriz Suma : \n");

		for (int i = 0 ; i < suma.length; i++) {
			for(int j = 0 ; j < suma.length; j ++) {
				
				suma[i][j] = arry1[i][j] + arry2[i][j];
				
				System.out.print (suma[i][j]+" ");
			}
			System.out.println("\n");
		}
		
	}

}
