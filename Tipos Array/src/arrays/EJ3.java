package arrays;


public class EJ3 {

	public static void main(String[] args) {
		int num[];
		
		num = new int[10];
		
		int alt , my = 0 ;
				
		System.out.print("Numero en la array : ");
		
		for(int i = 1; i < num.length-1;i ++) {
			
			alt = (int)(Math.random()*20+1);
			
			num[i] = alt;
			
			System.out.print(num[i]+" ");
			
			if (my < num[i]) {
				my = num[i];
			}
			
		}
		
		System.out.println("\n");
		
		System.out.println("El numero mas grande es "+my);
		
	}
}