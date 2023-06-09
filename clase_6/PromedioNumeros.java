package clase_6;

import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String args[]){
        System.out.println("Promedio de 3 números.");
        System.out.println("Ingresa 3 números para conocer el promedio");
        Scanner teclado = new Scanner(System.in);

        int countNumeros = 0;
        int sumaNumeros = 0;
        float promedio = 0;

        while(countNumeros < 3){
            System.out.print("Ingresa número: ");
            int valorNumero = teclado.nextInt();
            sumaNumeros += valorNumero;
            countNumeros++;
        }

        promedio = ((float)sumaNumeros/3);

        System.out.printf("El promedio de los 3 números ingresados es: %.2f", promedio);



    }
}
