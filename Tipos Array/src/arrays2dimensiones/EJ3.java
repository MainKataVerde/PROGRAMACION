package arrays2dimensiones;


public class EJ3 {

	public static void main(String[] args) {
		int array1[][] = {
				
				{5,10,15},
				{20,25,30},
				{35,40,45}
		};
		
		System.out.println("Matriz original : ");
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				System.out.print(array1[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		System.out.println("Proceso de cada fila: ");
		
		
		float promedio = (array1[0][0]+array1[0][1]+array1[0][2])/3;
		
		System.out.println("Fila 1 : " + promedio);
		
		float promedio2 = (array1[1][0]+array1[1][1]+array1[1][2])/3;
		
		System.out.println("Fila 2 : " + promedio2);
		
		float promedio3 = (array1[2][0]+array1[2][1]+array1[2][2])/3;
		
		System.out.println("Fila 3 : " + promedio3);
		
		
		System.out.print("\n");
		
		System.out.println("Proceso de cada columna: ");
		
		float promedio4 = (array1[0][0]+array1[1][0]+array1[2][0])/3;
		
		System.out.println("Columna 1 : " + promedio4);
		
		float promedio5 = (array1[0][1]+array1[1][1]+array1[2][1])/3;
		
		System.out.println("Columna 2 : " + promedio5);
		
		float promedio6 = (array1[0][2]+array1[1][2]+array1[2][2])/3;
		
		System.out.println("Columna 3 : " + promedio6);
		
		
	}

}
