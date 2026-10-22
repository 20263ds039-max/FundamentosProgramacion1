import java.util.Scanner;

public class JuegoPuntos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int puntos = 100;
        int opcion;

        do {
            System.out.println(" MENU DE PUNTOS ");
            System.out.println("1. Ganar 20 puntos");
            System.out.println("2. Gastar 15 puntos");
            System.out.println("3. Consultar puntos");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    puntos += 20;
                    System.out.println("Ganaste 20 puntos.");
                    break;

                case 2:
                    if (puntos >= 15) {
                        puntos -= 15;
                        System.out.println("Gastaste 15 puntos.");
                    } else {
                        System.out.println("No tienes puntos suficientes.");
                    }
                    break;

                case 3:
                    System.out.println("Tienes " + puntos + " puntos.");
                    break;

                case 4:
                    System.out.println("Saliendo del juego...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 4);

        System.out.println("Puntos restantes: " + puntos);
    }
}