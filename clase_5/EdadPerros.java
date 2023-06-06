package clase_5;

import java.util.Scanner;

public class EdadPerros {
    public static void main (String args[]){

        System.out.println("Ingresa edad de tu perro: ");


        Scanner scanEdad = new Scanner(System.in);
        Integer edadPerro = scanEdad.nextInt();

        //1 año humano = 7 años de perro
        Integer edad = edadPerro * 7;

        System.out.println("La edad de su perro es: " + edad + " años humanos");



    }
}
