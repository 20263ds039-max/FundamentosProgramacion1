import java.util.Scanner;

public class Main {

    public static double calcularTiempo(double tamaño, double velocidad) {
        double tiempo = tamaño / velocidad;
        return tiempo;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double tamaño;
        double velocidad;
        double tiempo;

        System.out.println("Ingresa el tamaño del archivo en MB:");
        tamaño = teclado.nextDouble();

        System.out.println("Ingresa la velocidad de descarga en MB por segundo:");
        velocidad = teclado.nextDouble();

        if (tamaño >= 0 && velocidad > 0) {
            tiempo = calcularTiempo(tamaño, velocidad);
            System.out.println("Tiempo estimado de descarga: " + tiempo + " segundos");
        } else {
            System.out.println("Datos no validos");
        }
    }
}
