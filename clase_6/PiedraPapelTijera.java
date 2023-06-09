package clase_6;

import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String args[]){
        int piedra = 1, papel =2, tijeras =3;
        int ganador = 0; //1 cliente, 2 computadora
        //Ejercicio piedra papel o tijeras.
        //Reglas, piedra gana a tijeras, tijeras a papel y papel a piedra.
        System.out.println("Juego Piedra papel o tijeras");
        Scanner teclado = new Scanner(System.in);

        System.out.println("Elige tu elección: ");
        System.out.print("1)Piedra\n2)Papel\n3)Tijeras\n");
        System.out.print("Tu opción: ");
        int opcion = teclado.nextInt();

        System.out.print("Piedra...\nPapel...\no Tijeras...\n");
        int randomElection =  (int)(Math.random()*3+1);

        if(opcion == randomElection){
            System.out.println("Empate");
            System.out.print("Tu respuesta: "+opcion);
            System.out.print("Respuesta computadora: "+randomElection);
        }else{
            if(opcion == piedra && randomElection == tijeras){
                ganador = 1;
            }

            if(opcion == piedra && randomElection == papel){
                ganador = 2;
            }

            if(opcion == papel && randomElection == tijeras){
                ganador = 2;
            }

            if(opcion == papel && randomElection == piedra){
                ganador = 1;
            }

            if (opcion == tijeras && randomElection == papel){
                ganador = 1;
            }

            if(opcion == tijeras && randomElection == piedra){
                ganador = 2;
            }

            if (ganador == 1){
                System.out.println("¡Ganaste el juego!");
                System.out.print("Tu respuesta: "+opcion);
                System.out.print("Respuesta computadora: "+randomElection);
            }else{
                System.out.println("Suerte para la próxima");
                System.out.print("Tu respuesta: "+opcion);
                System.out.print("Respuesta computadora: "+randomElection);
            }

        }

    }
}
