import java.util.Scanner;
public class Ejercicio18 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		float sueldo = 1200, a�os = 0, resultado = 0;
		
		System.out.println("Buenos d�as, introduzca los a�os que llevas trabajando para la empresa.");
		a�os = teclado.nextInt();
		
		if(a�os >= 10) {
			
			resultado = sueldo + sueldo*(10/100f);
			System.out.println("Tu sueldo es de " + resultado + "�");
			
		}
		else if(a�os > 5 && a�os < 10) {
			
			resultado = sueldo + sueldo*(7/100f);
			System.out.println("Tu sueldo es de " + resultado + "�");
			
		}
		else if(a�os > 3 && a�os < 5) {
			
			resultado = sueldo + sueldo*(5/100f);
			System.out.println("Tu sueldo es de " + resultado + "�");
			
		}
		else {
			
			resultado = sueldo + sueldo*(3/100f);
			System.out.println("Tu sueldo es de " + resultado + "�");
		}
		
	}

}
