import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		//Pedir un número del 1 al 7 y diga el día de la semana correspondiente.
		
		Scanner dia = new Scanner(System.in);
		int num = 0;
		System.out.println("Escriba un número que vaya del 1-7 cualquiera");
		 num = dia.nextInt();
		 
		 if(num == 1) {
			 
			 System.out.println("Hoy es lunes.");
		 }
		 else if(num == 2) {
			 
			 System.out.println("Hoy es martes.");
		 }
		 else if(num == 3) {
			 
			 System.out.println("Hoy es miércoles.");
		 }
		 else if(num == 4) {
			 
			 System.out.println("Hoy es jueves.");
		 }
		 else if(num == 5) {
			 
			 System.out.println("Hoy es viernes.");
		 }
		 else if(num == 6) {
			 
			 System.out.println("Hoy es sábado.");
		 }
		 else if(num == 7) {
			 
			 System.out.println("Hoy es domingo.");
		 }
		 else {
			 
			 System.out.println("El número que has introducido no corresponde con ninguno de los días de la semana.");
		 }
		 

	}

}
