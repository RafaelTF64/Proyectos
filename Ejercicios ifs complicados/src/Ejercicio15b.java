import java.util.Scanner;
public class Ejercicio15b {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
		
		int maximo = num1;
		int minimo = num1;
		
		System.out.println("Introduce el primer número");
		num1 = teclado.nextInt();
		
		System.out.println("Introduce el segundo número");
		num2 = teclado.nextInt();
		
		System.out.println("Introduce el tercer número");
		num3 = teclado.nextInt();
		
		System.out.println("Introduce el cuarto número");
		num4 = teclado.nextInt();
		
		System.out.println("Introduce el quinto número");
		num5 = teclado.nextInt();
		
		teclado.close();
		
		
		
		if(num2 > maximo) {
			
			maximo = num2;
		}
		if(num2 < minimo) {
			
			minimo = num2;
		}
		if(num3 > maximo) {
			
			maximo = num3;
		}
		if(num3 < minimo) {
			
			minimo = num3;
		}
		if(num4 > maximo) {
			
			maximo = num4;
		}
		if(num4 < minimo) {
			
			minimo = num4;
		}
		if(num5 > maximo) {
			
			maximo = num5;
		}
		if(num5 < minimo) {
			
			minimo = num5;
		}
		
		System.out.println("El mayor es: " + maximo);
		System.out.println("El menor es: " + minimo);
	}

}
