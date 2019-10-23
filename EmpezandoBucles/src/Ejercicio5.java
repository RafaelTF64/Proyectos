import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		// Se leen desde el teclado x números enteros comprendidos en el intervalo de 0 a 100
		//y se desea hacer un algoritmo que imprima el menor y el mayor de los que se han leído.
		
		Scanner teclado = new Scanner(System.in);
		int num = 0;
		int max = -1000;
		int min = 1000;
		
		for(int i=1; i<10; i++) {
			
			System.out.println("Introduce un número del 0 al 100.");
			num = teclado.nextInt();
			
			if(num<0 || num>100) {
				
				i=1000;
			}
			if(num>max) {
				
				max = num;
			}
			if(num<min) {
				
				min = num;
			}
		}	
		if(num<0 || num>100) {
			
			System.out.println("Error! Has introducido un número fuera del intervalo de valores.");
		}
		else {
			
			System.out.println("El número máximo es: " + max);
			System.out.println("El número mínimo es: " + min);
		}
		
			
		
	}

}
