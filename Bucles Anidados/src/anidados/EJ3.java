package anidados;


public class EJ3 {

	public static void main(String[] args) {
		//hacer un for separado para los primero numero 
		//otro para las lineas del medio
		// hacer un doble for el primero con el i + " | "
		// y en el del medio haciendo las tablas no cual es ln y cual no
		System.out.print("     ");
		for(int i = 1 ; i <= 10; i++){
			System.out.print(i + "  ");
		}
		System.out.println("     ");
		System.out.print("     ");
		for(int j = 1 ; j<= 10; j++){
			System.out.print("---");
		}
		System.out.println(" ");
		for(int k = 1; k <= 10; k++){
			System.out.println(k+" |"+(k*k));
			for(int m = 0 ; m <= 10 ; m++) {
				//System.out.print(k);
			}
		}
	}
}

