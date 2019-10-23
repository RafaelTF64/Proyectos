import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		// Pedir 5 números y diga cuál es el mayor y cual el menor.
		
		Scanner teclado = new Scanner(System.in);
		int numero1 = 0, numero2 = 0, numero3 = 0, numero4 = 0, numero5 = 0;
		
		System.out.println("Introduce el primer número:");
		numero1 = teclado.nextInt();
		
		System.out.println("Introduce el segundo número:");
		numero2 = teclado.nextInt();
		
		System.out.println("Introduce el tercer número:");
		numero3 = teclado.nextInt();
		
		System.out.println("Introduce el cuarto número:");
		numero4 = teclado.nextInt();
		
		System.out.println("Introduce el quinto número:");
		numero5 = teclado.nextInt();
		
		if(numero1>numero2 && numero1>numero3 && numero1>numero4 && numero1>numero5) {
			
			if(numero2<numero3 && numero2<numero4 && numero2<numero5) {
				
				System.out.println("El número mayor es el: " + numero1);
				System.out.println("El número menor es el: " + numero2);
			}
			else if(numero3<numero2 && numero3<numero4 && numero3<numero5) {
				
				System.out.println("El número mayor es el: " + numero1);
				System.out.println("El número menor es el: " + numero3);
				
			}
			else if(numero4<numero3 && numero4<numero2 && numero4<numero5) {
				
				System.out.println("El número mayor es el: " + numero1);
				System.out.println("El número menor es el: " + numero4);
			}
			else {
				
				System.out.println("El número mayor es el: " + numero1);
				System.out.println("El número menor es el: " + numero5);
			}
		}
		else if(numero2>numero1 && numero2>numero3 && numero2>numero4 && numero2>numero5) {
			
			if(numero3<numero1 && numero3<numero4 && numero3<numero5) {
				
				System.out.println("El número mayor es el: " + numero2);
				System.out.println("El número menor es el: " + numero3);
			}
			else if(numero4<numero2 && numero4<numero1 && numero4<numero5) {
				
				System.out.println("El número mayor es el: " + numero2);
				System.out.println("El número menor es el: " + numero4);
				
			}
			else if(numero5<numero3 && numero5<numero2 && numero5<numero1) {
				
				System.out.println("El número mayor es el: " + numero2);
				System.out.println("El número menor es el: " + numero5);
			}
			else {
				
				System.out.println("El número mayor es el: " + numero2);
				System.out.println("El número menor es el: " + numero1);
			}
		}
		else if(numero3>numero2 && numero3>numero1 && numero3>numero4 && numero3>numero5) {
			
            if(numero2<numero1 && numero2<numero4 && numero2<numero5) {
				
				System.out.println("El número mayor es el: " + numero3);
				System.out.println("El número menor es el: " + numero2);
			}
			else if(numero4<numero2 && numero4<numero4 && numero4<numero5) {
				
				System.out.println("El número mayor es el: " + numero3);
				System.out.println("El número menor es el: " + numero4);
				
			}
			else if(numero5<numero1 && numero5<numero2 && numero5<numero5) {
				
				System.out.println("El número mayor es el: " + numero3);
				System.out.println("El número menor es el: " + numero5);
			}
			else {
				
				System.out.println("El número mayor es el: " + numero3);
				System.out.println("El número menor es el: " + numero1);
			}
		}
		else if(numero4>numero2 && numero4>numero3 && numero4>numero1 && numero4>numero5) {
			
			if(numero2<numero1 && numero2<numero3 && numero2<numero5) {
				
				System.out.println("El número mayor es el: " + numero4);
				System.out.println("El número menor es el: " + numero2);
			}
			else if(numero3<numero2 && numero3<numero1 && numero3<numero5) {
				
				System.out.println("El número mayor es el: " + numero4);
				System.out.println("El número menor es el: " + numero3);
				
			}
			else if(numero5<numero1 && numero5<numero2 && numero5<numero3) {
				
				System.out.println("El número mayor es el: " + numero4);
				System.out.println("El número menor es el: " + numero5);
			}
			else {
				
				System.out.println("El número mayor es el: " + numero4);
				System.out.println("El número menor es el: " + numero1);
			}
		}
		else {
			
            if(numero2<numero1 && numero2<numero4 && numero2<numero3) {
				
				System.out.println("El número mayor es el: " + numero5);
				System.out.println("El número menor es el: " + numero2);
			}
			else if(numero4<numero2 && numero4<numero1 && numero4<numero3) {
				
				System.out.println("El número mayor es el: " + numero5);
				System.out.println("El número menor es el: " + numero4);
				
			}
			else if(numero3<numero1 && numero3<numero2 && numero3<numero4) {
				
				System.out.println("El número mayor es el: " + numero5);
				System.out.println("El número menor es el: " + numero3);
			}
			else {
				
				System.out.println("El número mayor es el: " + numero5);
				System.out.println("El número menor es el: " + numero1);
			}
			
		}
	}

}
