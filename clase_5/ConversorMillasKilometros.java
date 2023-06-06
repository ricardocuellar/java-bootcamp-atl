package clase_5;

import java.util.Scanner;

public class ConversorMillasKilometros {

    public static void main(String args[]){

        System.out.println("Ingresa la distancia en Millas");
        Scanner scanMillas = new Scanner(System.in);
        double millas = scanMillas.nextDouble();

        double kilometros = millas * 1.60934;

        System.out.println("La distancia en kilometros es: " + kilometros + "Km");

    }

}
