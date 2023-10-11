package main;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ifelse4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//utilizamos la clase dateformat y simpledate fotma para sacar solo la fecha 
		DateFormat dateFormat = new SimpleDateFormat("yyy");
		
		String date = dateFormat.format(new Date());
		
		int dt = Integer.parseInt(date);
		
		int fc = sc.nextInt();
		
		int res1 = dt-fc;
				
		if (fc<=dt) {
			System.out.println(res1);
		}else {
			System.out.println("Fecha no valida");

		}
	}

}
