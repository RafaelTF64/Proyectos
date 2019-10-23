import java.util.Scanner;
public class Ejercicio18 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		float sueldo = 1200, años = 0, resultado = 0;
		
		System.out.println("Buenos días, introduzca los años que llevas trabajando para la empresa.");
		años = teclado.nextInt();
		
		if(años >= 10) {
			
			resultado = sueldo + sueldo*(10/100f);
			System.out.println("Tu sueldo es de " + resultado + "€");
			
		}
		else if(años > 5 && años < 10) {
			
			resultado = sueldo + sueldo*(7/100f);
			System.out.println("Tu sueldo es de " + resultado + "€");
			
		}
		else if(años > 3 && años < 5) {
			
			resultado = sueldo + sueldo*(5/100f);
			System.out.println("Tu sueldo es de " + resultado + "€");
			
		}
		else {
			
			resultado = sueldo + sueldo*(3/100f);
			System.out.println("Tu sueldo es de " + resultado + "€");
		}
		
	}

}
