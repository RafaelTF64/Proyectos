package Ejerciciosifs;

public class Ejercicio3{
    public static void main(String args[]){
        int numero = 2;
        int numero2 = 4;

        if (numero % numero2 == 0){

            System.out.println(numero + " es múltiplo de " + numero2);
        }
        if (numero2 % numero == 0){

            System.out.println("");
        }
        else {

            System.out.println("Son iguales");
        }
    }
}