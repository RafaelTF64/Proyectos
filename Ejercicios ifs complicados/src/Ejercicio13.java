import java.util.Scanner;

public class Ejercicio13 {
	
	public static void main(String[] args) {
		//Que lea una hora en formato hora, minutos, segundos y diga la hora que es un
		//segundo después.
		
		Scanner teclado = new Scanner(System.in);
		
		int hora = 0;
		int minutos = 0;
		int segundos = 0;
		
		//leo el reloj
		System.out.println("Introduce aquí la hora");
		hora = teclado.nextInt();
		
		System.out.println("Introduce aquí los minutos");
		minutos = teclado.nextInt();
		
		System.out.println("Introduce aquí los segundos");
		segundos = teclado.nextInt();
		
		teclado.close();
		
		System.out.println(hora + ":"+minutos+":"+segundos);
		
		segundos++;
		
		if (segundos == 60) {
			
			segundos = 0;
			minutos++;
			
			if (minutos == 60) {
			
			minutos = 0;
			hora++;
			
				if(hora == 24) {
			
					hora = 0;
		
				}	
			}	
		}
		
		System.out.println("La hora es " + hora + ":" + minutos + ":" + segundos);
		
	}
}
