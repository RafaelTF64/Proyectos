package Ejerciciosifs;

public class Ejercicio71{
    public static void main(String args[]){

        int numero1 = 8;
        int numero2 = 9;
        int numero3 = 7;

        if((numero1 > numero2)&&(numero1 > numero3)){

            if(numero2 > numero3){

                System.out.println(numero1 + ">" + numero2 + ">" + numero3);
            }
            else if(numero3 > numero2){

                System.out.println(numero1 + ">" + numero3 + ">" + numero2);
            }
            else{

                System.out.println("Había números repetidos y no sé cual es el mayor.");
            }
        }
        if((numero2 > numero1)&&(numero2 > numero3)){

            if(numero1 > numero3){

                System.out.println(numero2 + ">" + numero1 + ">" + numero3);
            }
            else if(numero3 > numero1){

                System.out.println(numero2 + ">" + numero3 + ">" + numero1);
            }
            else{

                System.out.println("Había números repetidos y no sé cual es el mayor.");
            }
        }
        if((numero3 > numero1)&&(numero3 > numero2)){

            if(numero1 > numero2){

                System.out.println(numero3 + ">" + numero1 + ">" + numero2);
            }
            else if(numero2 > numero1){

                System.out.println(numero3 + ">" + numero2 + ">" + numero1);
            }
            else{

                System.out.println("Había números repetidos y no sé cual es el mayor.");
            }
        }
        else{

            System.out.println("Había números repetidos y no sé cual es el mayor.");
        }
    }
}