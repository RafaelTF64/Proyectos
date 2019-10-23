import java.util.Scanner;

public class Ejercicio23 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		float consumo = 0, consumo2 = 0, consumo3 = 0, consumo4 = 0, consumo5 = 0;
		
		System.out.println("Introduce el consumo de agua en m³");
		consumo = teclado.nextInt();
		
		if(consumo > 100) {
			
			consumo2 = 100 * 0.15f;
			
			if (consumo < 500) {
				
				consumo3 = (consumo - 100)*0.20f;
				consumo = consumo2 + consumo3;
				System.out.println("El coste total del agua es de: " + consumo + "€");
			}
			else if(consumo < 1000) {
				
				consumo3 = 400*0.20f;
				consumo4 = (consumo - 500)*0.35f;
				consumo = consumo2 + consumo3 + consumo4;
				System.out.println("El coste total del agua es de: " + consumo + "€");
			}
			else {
				
				consumo3 = 400*0.20f;
				consumo4 = 500*0.35f;
				consumo5 = (consumo - 1000)*0.85f;
				consumo = consumo2 + consumo3 + consumo4 + consumo5;
				System.out.println("El coste total del agua es de: " + consumo + "€");
			}
		}
		else {
			
			consumo = consumo*0.15f;
			System.out.println("El coste total del agua es de: " + consumo + "€");
			
		}
		
	}
}
