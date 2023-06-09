package clase_5;

import java.util.Scanner;

public class MayorOMenor {
    public static void main(String args[]){
        //Cargar 3 números y mostrar el menor y mayor número.
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cargué el primer número");
        int numero1 = teclado.nextInt();

        System.out.println("Cargué el primer número");
        int numero2 = teclado.nextInt();

        System.out.println("Cargué el primer número");
        int numero3 = teclado.nextInt();

        if(numero1 > numero2 && numero1 > numero3){
            System.out.println("El número más grande es: "+numero1);
        }

        if(numero3 > numero2 && numero3 > numero1){
            System.out.println("El número más grande es: "+numero1);
        }

        if(numero2 > numero1 && numero2 > numero3){
            System.out.println("El número más grande es: "+numero1);
        }

    }
}
