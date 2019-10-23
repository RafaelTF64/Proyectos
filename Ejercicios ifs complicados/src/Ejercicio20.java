import java.util.Scanner;
public class Ejercicio20 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		float producto1 = 0, producto2 = 0, producto3 = 0, resultado = 0;
		
		System.out.println("Introducir precio del producto 1.");
		producto1 = teclado.nextInt();
		System.out.println("Introducir precio del producto 2.");
		producto2 = teclado.nextInt();
		System.out.println("Introducir precio del producto 3.");
		producto3 = teclado.nextInt();
		
		resultado = producto1 + producto2 + producto3;
	
	if(resultado > 500 && resultado < 1000) {
		
		resultado = resultado + resultado * (3/100f);
		System.out.println("El producto 1 vale: " + producto1 + "$");
		System.out.println("El producto 2 vale: " + producto2 + "$");
		System.out.println("El producto 3 vale: " + producto3 + "$");
		System.out.println("El precio total a pagar es de: " + resultado + "$");
	}
	else if(resultado > 1000 && resultado < 2000) {
		
		resultado = resultado + (resultado * (5/100f));
		System.out.println("El producto 1 vale: " + producto1 + "$");
		System.out.println("El producto 2 vale: " + producto2 + "$");
		System.out.println("El producto 3 vale: " + producto3 + "$");
		System.out.println("El precio total a pagar es de: " + resultado + "$");
	}
	else if(resultado >= 2000 && resultado <= 3000) {
		
		resultado = resultado + resultado * (7/100f);
		System.out.println("El producto 1 vale: " + producto1 + "$");
		System.out.println("El producto 2 vale: " + producto2 + "$");
		System.out.println("El producto 3 vale: " + producto3 + "$");
		System.out.println("El precio total a pagar es de: " + resultado + "$");
	}
	else if(resultado > 3000) {
		
		resultado = resultado + resultado * (10/100f);
		System.out.println("El producto 1 vale: " + producto1 + "$");
		System.out.println("El producto 2 vale: " + producto2 + "$");
		System.out.println("El producto 3 vale: " + producto3 + "$");
		System.out.println("El precio total a pagar es de: " + resultado + "$");
	}
	else {
		
		System.out.println("El producto 1 vale: " + producto1 + "$");
		System.out.println("El producto 2 vale: " + producto2 + "$");
		System.out.println("El producto 3 vale: " + producto3 + "$");
		System.out.println("El precio total a pagar es de: " + resultado + "$");
	}
		
		
  }
}
