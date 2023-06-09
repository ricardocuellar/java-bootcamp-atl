package clase_6;

import java.util.Scanner;

public class GoogleMapsSearch {
    public static void main(String args[]){
        System.out.println("Buscador de países");
        System.out.print("Ingresa un país para buscar: ");
        Scanner teclado = new Scanner(System.in);
        String pais = teclado.next();

        String urlPais = "https://www.google.com/maps/search/"+pais;
        System.out.println("Aquí tienes la ubicación del país buscado: "+urlPais);

    }
}
