import java.util.Scanner;

public class TorneoVideojuegos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int puntos, total = 0;
        int mas1000 = 0, menosIgual1000 = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Puntos de la partida " + i + ": ");
            puntos = teclado.nextInt();

            total += puntos;

            if (puntos > 1000) {
                mas1000++;
            } else {
                menosIgual1000++;
            }
        }

        double promedio = total / 7.0;

        System.out.println("Puntos acumulados: " + total);
        System.out.println("Promedio: " + promedio);
        System.out.println("Partidas con mas de 1000 puntos: " + mas1000);
        System.out.println("Partidas con 1000 puntos o menos: " + menosIgual1000);
    }
}