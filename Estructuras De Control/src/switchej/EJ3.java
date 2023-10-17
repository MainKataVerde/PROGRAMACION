package switchej;

import java.util.Scanner;

public class EJ3 {

	public static void main(String[] args) {
		//VARIABLE
		int num ;
		char tipo , res;
		float dor , eur ;
		
		eur=1.06f;
		dor=0.95f;
		
		//NUMERO DE USUARIO
		Scanner sc = new Scanner(System.in);
		System.out.println("En que moneda quieres el dinero Dolares (D/d) o Euros(E/e)");
		tipo = sc.next().charAt(0);
		System.out.println("Que cantidad quieres");
		num = sc.nextInt();
		System.out.println("Quieres intercambiar pasarlo a la otra moneda S/N");
		res = sc.next().charAt(0);
		if (res=='S'||res=='s') {
			
				switch(tipo){
				 	case 'D':
				 	case 'd':
				 		System.out.println("Tus "+num+"$"+" equivalen a "+(num*eur)+"€");
				 	break;
				 	
				 	case 'E':
				 	case 'e':
				 		System.out.println("Tus "+num+"€"+" equivalen a "+(num*dor)+"$");
				 	break;
				}
		}else if(res=='N'||res=='n'){
				switch(tipo){
					case 'D':
					case 'd':
						System.out.println("Tu valor es "+num+"$");
					break;
	 	
					case 'E':
					case 'e':
						System.out.println("Tu valor es "+num+"€");;
					break;
				}
		
			}else {
				System.out.println("Introduce una respuesta correcta");
			}
		}
}
