package enumes;

import java.util.Scanner;

public class EJ2 {
	
	public enum TipoVehiculo{
		COCHE,
		MOTO,
		AVION,
		CAMION,
		TRACTOR
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TipoVehiculo tipos;
		TipoVehiculo tipoVehiculo[] = TipoVehiculo.values();
		
		System.out.print("1.COCHE\n2.MOTO\n3.AVION\n4.CAMION\n5.TRACTOR\nElije un tipo vehiculo:");
		
		int vh = scanner.nextInt();
		
		scanner.close();
		
		tipos = tipoVehiculo[vh-1];
		
		switch (tipos) {
		case COCHE:
			System.out.println("Los coches son un vehiculos muy fiables");
			break;	
		case MOTO:
			System.out.println("Las motos son mas debiles que los coches");
			break;
		case AVION:
			System.out.println("Los aviones vuela omg");
			break;
		case CAMION:
			System.out.println("Transpotan mercancia");
			break;
		case TRACTOR:
			System.out.println("Se utiliza en el campo");
			break;
		default:
			
		break;
		}
		
	}

}
