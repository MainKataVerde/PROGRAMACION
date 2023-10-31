package enumes;

public class EJ4 {

	public enum ColorArcoiris{
		ROJO,
		NARANJA,
		AMARILLO,
		VERDE,
		AZUL,
		VIOLETA
	}
	
	public static void main(String[] args) {
		ColorArcoiris colores;
		ColorArcoiris COLORES[] = ColorArcoiris.values();
		int num = COLORES.length-1;
		
		for(int i = 0 ; i <= num;i++) {
			colores = COLORES[i];
			System.out.println(colores);
		}
	}

}
