package condicioneslogicas;

import java.util.Scanner;

public class EJ1 {

	public static void main(String[] args) {
		int angulo1 , angulo2 , angulo3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los 3 angulos de un triangulo");
		System.out.print("Primer angulo = ");
		angulo1 = sc.nextInt();
		System.out.print("Segundo angulo = ");
		angulo2 = sc.nextInt();
		System.out.print("Tercer angulo = ");
		angulo3 = sc.nextInt();
		
		sc.close();
		
		if(angulo1!=angulo2 && angulo1!=angulo3 && angulo2!=angulo3 && angulo2!=angulo1 && angulo3!=angulo2 && angulo3!=angulo1 ) {
			System.out.println("Tu triangulo es escaleno");
		}else if (((angulo1 + angulo2)/angulo3)==2) {
			System.out.println("Tu triangulo es rectangulo");
		}else if (((angulo1 + angulo2)/angulo3)!=2) {
			System.out.println("Tu triangulo es isosceler");
		}
	}

}

