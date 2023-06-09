package clase_6;

import java.util.Scanner;

public class WhatsappCall {
    public static void main(String args[]){
        System.out.println("Llamada por Whatsapp");
        System.out.print("Ingresa un numero de télefono sin espacios: ");
        Scanner teclado = new Scanner(System.in);
        String telefono = teclado.next();
        String urlWhatsapp = "https://api.whatsapp.com/send?phone="+telefono;

        System.out.println("Llamar por whatsapp: "+urlWhatsapp);

    }
}
