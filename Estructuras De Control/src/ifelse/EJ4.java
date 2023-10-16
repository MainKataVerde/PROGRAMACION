package ifelse;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EJ4 {
	//en este ejecicio tenemos que hacer un calculo con la fecha actual y la fecha q nos de el usuario que no puede ser mayor a la fecha actial
	public static void main(String[] args) {
		//variables
		int dt , fc , res1 ;
		Scanner sc = new Scanner(System.in);
		//utilizamos la clase dateformat y simpledate fotma para sacar solo la fecha 
		DateFormat dateFormat = new SimpleDateFormat("yyy");
		//guardamos el nuevo formato de fecha en una variable tipo sting
		String date = dateFormat.format(new Date());
		/*
		 * date se guarda en una stinge pero como lo que queremos es el año solo
		 * podemos pasar el valor de date a otra varibale y convertirla en int
		 */
		 dt = Integer.parseInt(date);
		//sacamos la fecha de nacimiento del usuario
		 fc = sc.nextInt();
		
		 res1 = dt-fc;
		//si la fecha de naciemiento del usuario es mayo o igual que la actual se hace la operacion  		
		if (fc<=dt) {
			System.out.println(res1);
		}else {//si no ocurre lo dicbo antes quieres decir que la fecha es futura asi que no ha nacido aun y no da resulatado
			System.out.println("Fecha no valida");

		}
		
		sc.close();
	}

}
