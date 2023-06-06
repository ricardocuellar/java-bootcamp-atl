package clase_5;

import java.util.Scanner;

public class CalculadoraPropinas {
    public static void main(String args[]){
        Scanner scanData = new Scanner(System.in);

        System.out.println("Ingresa el total de la cuenta");
        double cuenta = scanData.nextDouble();

        System.out.println("¿Qué propina desea dejar?");
        double porcentajePropina = scanData.nextInt();

        if(cuenta>0 && porcentajePropina > 0){
            double propina = cuenta * (porcentajePropina / 100);
            System.out.print("El total a pagar es: " + propina);
        }






    }
}
