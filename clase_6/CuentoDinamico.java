package clase_6;

import java.util.Scanner;

public class CuentoDinamico {
    public static void main(String args[]){
        System.out.println("Bienvenido a la historia 'Elige tu propia aventura'");
        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso: ");
        System.out.println("1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante");
        System.out.println("2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora");
        System.out.print("Tu respuesta: ");

        Scanner teclado = new Scanner(System.in);
        int respuesta1 = teclado.nextInt();

        if(respuesta1 == 1){
            System.out.println("Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y mágicos. Te maravillas con las joyas y los objetos preciosos que llenan la sala. Te das cuenta de que has encontrado el legendario tesoro perdido del bosque. Con tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo. ¡Felicidades, has tenido un final exitoso en tu búsqueda!");
        }

        if(respuesta1 == 2) {
            System.out.printf("Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora. Al llegar a la cabaña, te das cuenta de que hay dos puertas: \n" +
                    "1) Entras por la puerta de la izquierda \n" +
                    "2) Optas por la puerta de la derecha\n2");
            System.out.print("Tu respuesta: ");
            int respuesta2 = teclado.nextInt();
            if(respuesta2 == 1){
                System.out.println("De repente, las respuestas que buscabas cobran sentido en tu mente, y encuentras la claridad que anhelabas. Te das cuenta de que la búsqueda en este bosque misterioso no se trataba tanto de encontrar tesoros materiales, sino de descubrir el verdadero tesoro: el autoconocimiento y la sabiduría interior. Con el corazón lleno de gratitud, te despides del anciano y regresas al mundo exterior, llevando contigo un nuevo sentido de propósito y la valiosa experiencia de haber encontrado la verdadera riqueza en tu interior.\n" );
            }

            if(respuesta2 == 2){
                System.out.println("De repente te encuentras con una habitación llena de tesoros brillantes y mágicos. Te maravillas con las joyas y los objetos preciosos que llenan la sala. Cada rincón brilla con una luz resplandeciente y una energía mística.\n" +
                        "\n" +
                        "Con cautela, te acercas a un cofre antiguo adornado con gemas preciosas. Al abrirlo, descubres un mapa antiguo que muestra la ubicación de un tesoro aún más grande y poderoso, oculto en las profundidades del bosque.\n" +
                        "\n" +
                        "Intrigado y emocionado por la perspectiva de encontrar este legendario tesoro, decides embarcarte en una nueva aventura. Te llevas contigo las joyas que has encontrado como símbolo de tu éxito hasta ahora y te adentras nuevamente en el bosque misterioso, esta vez con el objetivo de descubrir el tesoro oculto que te espera. Con determinación, sigues el mapa en busca de nuevas emociones y desafíos.");
            }
        }





    }
}
