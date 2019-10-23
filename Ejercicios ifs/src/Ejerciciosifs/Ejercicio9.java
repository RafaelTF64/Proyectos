package Ejerciciosifs;

public class Ejercicio9{
    public static void main(String args[]){

        int numero = 3472;
        int unidades = numero%10;
        int decenas = numero/10%10;
        int centenas = numero/100%10;
        int unidadesmillar = numero/1000%10;

        System.out.println(numero);

        int numeroReves = unidades*1000+decenas*100+centenas*10+unidadesmillar;

        System.out.println(numeroReves);

        
    }
}