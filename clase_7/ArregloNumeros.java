package clase_7;

import java.util.Scanner;

public class ArregloNumeros {

    public static void main(String args[]){
        int[] numeros = new int[5];
        Scanner teclado = new Scanner(System.in);

        //Arrays.stream(numeros).forEach(System.out::println);

        for (int contador = 0; contador < numeros.length; contador++){
            System.out.println("Ingrese un número: ");
            int numero = teclado.nextInt();
            numeros[contador] = numero;
        }

        int mayor = 0;
        int menor = 0;

        for (int contador = 0; contador < numeros.length; contador++){
            int num = numeros[contador];
            if(num >= mayor || contador == 0){
                mayor = num;
            }

            if(num <= menor || contador == 0){
                menor = num;
            }
            System.out.println(numeros[contador]);
        }

        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);

        int sumatoria = 0;
        for(int contador = 0; contador<numeros.length; contador++){
            int num = numeros[contador];
            sumatoria += num;

        }

        System.out.println("La sumatoria es: "+sumatoria);
        float promedio = (float)sumatoria / numeros.length;

        System.out.println("El promedio es: "+promedio);




        /*
        int contador = 0;
        do {
            System.out.println("Ingrese un número: ");
            int numero = teclado.nextInt();
            numeros[contador] = numero;
            contador++;
        }while(contador < numeros.length);
        while(contador < numeros.length){
            System.out.println("Ingrese un número: ");
            int numero = teclado.nextInt();
            numeros[contador] = numero;

            contador++;
        }*/

        /*
        contador = 0;
        do {
            System.out.println(numeros[contador]);
            contador++;
        }while(contador < numeros.length);
        /*
        while(contador < numeros.length){
            System.out.println(numeros[contador]);
            contador++;
        }
        */


    }

}
