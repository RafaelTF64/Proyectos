import java.util.Scanner;

public class Ejercicio21 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int temperatura = 0;
		
		System.out.println("Introduce la temperatura actual");
		temperatura = teclado.nextInt();
		
		if(temperatura > 30) {
			
			System.out.println("Temperatura ideal para hacer natación.");
		}
		else if(temperatura > 20 && temperatura <= 30) {
			
			System.out.println("Temperatura ideal para jugar al Tenis.");
		}
		else if(temperatura > 10 && temperatura <= 20) {
			
			System.out.println("Temperatura ideal para ir al Golf.");
		}
		else if(temperatura > 5 && temperatura <= 10) {
			
			System.out.println("Temperatura ideal para hacer Esquí.");
		}
		else
			
			System.out.println("Temperatura ideal para jugar al parchís");
	}
}
