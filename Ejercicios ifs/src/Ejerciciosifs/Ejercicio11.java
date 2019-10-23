package Ejerciciosifs;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		int numero = 8;
		
		if(numero < 5) {
			
			System.out.println("Tú media es de " + numero + ",osea, estas suspenso.");
			
		}
		else if (5<=numero && 6>numero) {
		
			System.out.println("Tú media es de " + numero + ",osea, estás aprobado.");
			
		}
		else {
			
			System.out.println("Tú media es de " + numero + ",osea, está muy bien.");
		}
	}

}
