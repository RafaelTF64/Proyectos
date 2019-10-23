package Ejerciciosifs;

public class Ejercicio8{
    public static void main(String args[]){

        int numero = 37;
        int unidad = numero%10;
        int decena = numero/10%10;
        int centena = numero/100%10;
        int millar = numero/1000%10;

        System.out.println("El número es "+ numero);
        
        if (millar == 0 && centena != 0){
        	
        	System.out.println("El número del revés es: " + unidad + decena + centena);
        }
        else if(centena == 0 && decena != 0) {
        	
        	System.out.println("El número del revés es: " + unidad + decena);
        }
        else if(decena == 0) {
        	
        	System.out.println("El número del revés es: " + unidad);
        }
        else {
        	
        	System.out.println("El número del revés es: " + unidad + decena + centena + millar);
        }
    }
}