import java.util.Scanner;

public class Main {

    public static double calcularRenta(double tarifa, int horas) {
        double total = tarifa * horas;
        return total;
    }

    public static void mostrarComprobante(double total) {
        System.out.println("Total a pagar: $" + total);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double tarifa;
        int horas;
        double total;

        System.out.println("Ingresa la tarifa por hora:");
        tarifa = teclado.nextDouble();

        System.out.println("Ingresa la cantidad de horas:");
        horas = teclado.nextInt();

        if (tarifa > 0 && horas > 0) {
            total = calcularRenta(tarifa, horas);
            mostrarComprobante(total);
        } else {
            System.out.println("Datos no validos");
        }
    }
}
