import java.util.Scanner;
public class Ejercicio17 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numero1 = 0, numero2 = 0, numero3 = 0;
		
		System.out.println("Introducir el primer n�mero");
		numero1 = teclado.nextInt();
		
		System.out.println("Introducir el segundo n�mero");
		numero2 = teclado.nextInt();
		
		System.out.println("Introducir el tercer n�mero");
		numero3 = teclado.nextInt();
		
		if(numero1 == numero2/numero3) {
			
			System.out.println("El n�mero " + numero3 + " es el resto de la divisi�n de " + numero2 + " y " + numero1);
			
		}
		else {
			
			System.out.println("El n�mero " + numero3 + " no es el resto de la divisi�n de " + numero2 + " y " + numero1);
		}
	}
}
