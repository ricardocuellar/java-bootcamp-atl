package clase_5;

import java.util.Scanner;

public class JuegoAdivinarNumero {
    public static void main(String args[]){

        Scanner scanData = new Scanner(System.in);
        System.out.println("Generando número... ");

        Integer numeroGenerado = (int)(Math.random()*100+1);


        System.out.println("Número obtenido. Adivina el número obtenido:  ");
        Integer numeroIngresado = scanData.nextInt();

        if( numeroIngresado == numeroGenerado){
            System.out.print("¡Felicidades! adivinaste el número" + numeroGenerado);
        }else{
            System.out.printf("No has adivinado el número. Número generado: %d , Número que ingresaste: %d", numeroGenerado, numeroIngresado);
        }

    }
}
