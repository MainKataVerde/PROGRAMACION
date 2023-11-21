package arrays2dimensiones;

public class EJ2 {

	public static void main(String[] args) {
		int [][] arry1 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int cambiada [][];
		cambiada = new int[3][3];
		
		System.out.println("Matriz Original :");
		
		for (int i = 0 ; i < arry1.length; i++) {
			for(int j = 0 ; j < arry1[i].length; j ++) {
				System.out.print (arry1[i][j]+" ");
			}
			System.out.println("\n");
		}
		
		System.out.println("Matriz Traspuesta :");
		
		for (int i = 0 ; i < cambiada.length; i++) {
			for(int j = 0 ; j < cambiada[i].length; j ++) {
				
				cambiada[i][j] = arry1[j][i];
				
				System.out.print (cambiada[i][j]+" ");
			}
			System.out.println("\n");
		}
	}

}
