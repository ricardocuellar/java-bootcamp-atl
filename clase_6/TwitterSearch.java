package clase_6;

import java.util.Scanner;

public class TwitterSearch {
    public static void main(String args[]){
        System.out.println("Buscador de Twitter.");

        System.out.print("Ingresa lo que quieres buscar en una palabra: ");
        Scanner teclado = new Scanner(System.in);
        String query = teclado.next();

        String urlSearch = "https://twitter.com/search?q="+query;
        System.out.println("Aquí los resultados de la palabra buscada: "+urlSearch);

    }
}
