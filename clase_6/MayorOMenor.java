package clase_6;

import java.util.Scanner;

public class MayorOMenor {
    public static void main(String args[]){
        System.out.println("Ingresa 3 números diferentes para saber cuál es el mayor o el menor");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Num1:");
        int numero1 = teclado.nextInt();
        System.out.println("Num2:");
        int numero2 = teclado.nextInt();
        System.out.println("Num3:");
        int numero3 = teclado.nextInt();

        if(numero1 > numero2 && numero1 > numero3){
            System.out.println("Numero "+ numero1 +" es mayor");

            if (numero2>numero3){
                System.out.println("Numero "+numero3+" es menor");
            }else{
                System.out.println("Numero "+numero2+" es menor");
            }
        }

        if(numero2 > numero1 && numero2 > numero3){
            System.out.println("Numero "+ numero2 +" es mayor");

            if (numero1>numero3){
                System.out.println("Numero "+numero3+" es menor");
            }else{
                System.out.println("Numero "+numero1+" es menor");
            }
        }

        if(numero3 > numero1 && numero3 > numero2){
            System.out.println("Numero "+ numero3 +" es mayor");

            if (numero1>numero2){
                System.out.println("Numero "+numero2+" es menor");
            }else{
                System.out.println("Numero "+numero1+" es menor");
            }
        }


    }
}
