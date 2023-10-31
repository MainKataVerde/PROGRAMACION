package enumes;

import java.util.Scanner;

public class EJ3 {
	
	public enum Mes{
		ENERO,
		FEBRERO,
		MARZO,
		ABRIL,
		MAYO,
		JUNIO,
		JULIO,
		AGOSTO,
		SEPTIEMBRE,
		OCTUBRE,
		NOVIEMBRE,
		DICIEMBRE
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Mes mes ;
		Mes MES[] = Mes.values();
		
		System.out.print("Dime un mes del año :");
		int num = scanner.nextInt();
		
		mes = MES[num-1];
		if (mes == Mes.ENERO || mes == Mes.MARZO || mes == Mes.MAYO || mes == Mes.JULIO ||
				mes == Mes.AGOSTO || mes == Mes.OCTUBRE || mes == Mes.DICIEMBRE) {
			System.out.println(mes+" tiene 31 dias");
		} else if (mes == Mes.ABRIL || mes == Mes.JUNIO || mes == Mes.SEPTIEMBRE ||
				mes == Mes.NOVIEMBRE) {
			System.out.println(mes + " tiene 30 dias");
		}else {
			System.out.println(mes + " tiene 28 dias en bisiesto 29");
		}
	}

}
