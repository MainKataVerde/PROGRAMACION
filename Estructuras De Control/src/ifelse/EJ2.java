package ifelse;

import java.util.Scanner;

public class EJ2 {

	public static void main(String[] args) {
		//Utilizamos la clase scanner para sacar la informacion del usuario
		Scanner sc = new Scanner(System.in);
		//Ponemos algunas variables
		int nm = sc.nextInt();
		/*si el numero es menos a 0 es negativo si el 
		 * numero es menos q 0 es negativo pero si no 
		 * es nada de eso quiere decir que es igual a 0 asi que si no es ninguno de ellos es 0
		 */
		if (nm<0) {
			System.out.println("El numero es negativo");
		}else if(nm>0){
			System.out.println("El numero es positivo");
		}else {
			System.out.println("El numero es igual a 0");
		}
		
		sc.close();
	}

}
