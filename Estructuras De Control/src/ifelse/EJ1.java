package ifelse;

import java.util.Scanner;

/*
 * Programa basico que su funcion es la de obtener un numero del ususrio
 * para que luego decir si ha aprobado el examen o no 
 */


public class EJ1 {

	public static void main(String[] args) {
		//creamos la variables necesarias
		int nt ;
		//sacamos la clase Scanner para sacar el numero de los usuarios
		Scanner sc = new Scanner(System.in);
			
		
		System.out.println("Itroduce la nota de tu examen");
		
		nt = sc.nextInt();
		
		/*
		 * En este if solo tenemos que hacer que si el numero sea mayo
		 * o igual que 60 el alumno haya aprovado 
		 * pero por si ponen un numero moyor a la nota maxima posible no de resultado
		 */
		
		if (nt>100) {
			
			System.out.println("Introduzca un numero dentro del rango de la nota");
			
			

		}else if(nt>=60){
			System.out.println("Aprovado");
		}else {
			System.out.println("Suspenso");

		}
	}

}
