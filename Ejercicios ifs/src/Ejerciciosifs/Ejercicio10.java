package Ejerciciosifs;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int numero = 3554;
		int unidad = numero%10;
		int decena = numero/10%10;
		int centena = numero/100%10;
		int millar = numero/1000%10;
		
		
		if(unidad == millar && decena == centena) {
			
			System.out.println("El n�mero " + numero + " es capic�a.");
		}
		else {
			
			System.out.println("El n�mero " + numero + " no es capic�a.");
		}
	}

}
