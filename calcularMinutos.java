import java.util.Scanner;

public class Main {

    public static int calcularMinutos(int bateria) {
        int minutos = 0;

        while (bateria < 100) {
            bateria = bateria + 8;

            if (bateria > 100) {
                bateria = 100;
            }

            minutos++;
        }

        return minutos;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int bateria;
        int minutos;
        int opcion = 1;

        while (opcion == 1) {
            System.out.println("Ingresa el porcentaje de bateria:");
            bateria = teclado.nextInt();

            if (bateria < 0 || bateria > 100) {
                System.out.println("Porcentaje no valido");
            } else {
                minutos = calcularMinutos(bateria);
                System.out.println("Minutos necesarios: " + minutos);
            }

            System.out.println("Deseas realizar otra simulacion?");
            System.out.println("1. Si");
            System.out.println("2. No");
            opcion = teclado.nextInt();
        }

        System.out.println("Programa finalizado");
    }
}