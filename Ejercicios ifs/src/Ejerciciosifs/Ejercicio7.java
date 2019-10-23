package Ejerciciosifs;

public class Ejercicio7{
    public static void main(String args[]){

        int numero1 = 20;
        int numero2 = 10;
        int numero3 = 16;

        if(numero1 > numero2){

            if(numero1 > numero3){

                if(numero2 > numero3){

                    System.out.println("El orden es " + numero1 + ">" + numero2 + ">" + numero3);
                }
                else{

                    System.out.println("El orden es " + numero1 + ">" + numero3 + ">" + numero2);
                }
            }
            else{

                System.out.println("El orden es " + numero3 + ">" + numero1 + ">" + numero2);
                
            }
        }
        else if(numero2 > numero3){

            if(numero3 > numero1){

                System.out.println("El orden es: " + numero2 + ">" + numero3 + ">" + numero1);
            }
            else{

                System.out.println("El orden es: " + numero2 + ">" + numero1 + ">" + numero3);
             }
        }
        else{

            System.out.println("El orden es: " + numero3 + ">" + numero2 + ">" + numero1);
        }
    }
}