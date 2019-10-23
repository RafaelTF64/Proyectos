import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// Elabore un algoritmo que imprima los primeros N números pares.

		Scanner teclado = new Scanner(System.in);
		int num = 0;
		
		System.out.println("¿Cuántos números pares quiere ver en pantalla?");
		num = teclado.nextInt();
		
		num = num * 2;
		
		for(int i = 0 ; i <= num ; i = i+2) {
			
			System.out.print(i + ", ");
		}
	}

}
