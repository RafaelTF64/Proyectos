import java.util.Scanner;
public class Ejercicio16 {

	public static void main(String[] args) {
		// Pedir tres n�meros e indicar si el tercero es igual a la suma del primero y el segundo.
		
		Scanner teclado = new Scanner(System.in);
		int numero = 0, numero2 = 0, numero3 = 0;
		
		System.out.println("Introduce el primer n�mero.");
		numero = teclado.nextInt();
		
		System.out.println("Introduce el segundo n�mero.");
		numero2 = teclado.nextInt();
		
		System.out.println("Introduce el tercer n�mero.");
		numero3 = teclado.nextInt();
		
		if(numero3 == numero2 + numero) {
			
			System.out.println("El tercer n�mero " + numero3 + " es igual a la suma de " + numero2 + " y " + numero );
		}
		else {
			
			System.out.println("El tercer n�mero " + numero3 + " no es igual a la suma de " + numero2 + " y " + numero );
		}
	}

}
