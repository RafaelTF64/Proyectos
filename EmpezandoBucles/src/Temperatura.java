import java.util.Scanner;
public class Temperatura {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num = 0;
		int suma = 0;
		int veces = 0;
		int max = -1000;
		int min = 1000;
		
		
		for(int i=1; i<=7; i++) {
			
			System.out.println("Escribe el numero " + i);
			num = teclado.nextInt();
			
			suma = suma + num;
			veces = veces + 1;
			
			if(num>max) {
				max = num;	
			}
			if(num<min) {
				min = num;
			}
		}
			
		System.out.println("Media = " + ((float)suma / veces ));
		System.out.println("Maximo = " + max);
		System.out.println("mínimo = " + min);
	}

}
