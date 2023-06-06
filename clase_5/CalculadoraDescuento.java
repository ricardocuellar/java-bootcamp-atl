package clase_5;

import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String args[]){
        Scanner scanData = new Scanner(System.in);

        System.out.println("Ingresa el precio del producto");

        double precioProducto = scanData.nextDouble();

        System.out.println("Ingresa el descuento del producto");
        double descuentoProducto = scanData.nextDouble();

        double precioFinalProducto = precioProducto - (precioProducto * (descuentoProducto / 100));

        System.out.println("El precio del producto ya rebajado es: $"+ precioFinalProducto);

    }
}
