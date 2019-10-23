import java.util.Scanner;
public class Ejercicio17 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int numero1 = 0, numero2 = 0, numero3 = 0;
		
		System.out.println("Introducir el primer número");
		numero1 = teclado.nextInt();
		
		System.out.println("Introducir el segundo número");
		numero2 = teclado.nextInt();
		
		System.out.println("Introducir el tercer número");
		numero3 = teclado.nextInt();
		
		if(numero1 == numero2/numero3) {
			
			System.out.println("El número " + numero3 + " es el resto de la división de " + numero2 + " y " + numero1);
			
		}
		else {
			
			System.out.println("El número " + numero3 + " no es el resto de la división de " + numero2 + " y " + numero1);
		}
	}
}
