import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner tackado = new Scanner(System.in);

        double horas, pago, totalRecaudado = 0, promedio;
        int autos = 0, descuentos = 0;

        while (true) {
            System.out.print("Ingrese las horas estacionado (0 para terminar): ");
            horas = tackado.nextDouble();

            if (horas == 0) {
                break;
            }

            if (horas < 0) {
                System.out.println("Error: las horas negativas no son validas.");
                continue;
            }

            pago = horas * 15;

            if (horas > 5) {
                pago = pago - 10;
                descuentos++;
            }

            autos++;
            totalRecaudado += pago;

            System.out.printf("El automovil debe pagar: $%.2f%n", pago);
        }

        System.out.println("\n===== RESUMEN FINAL =====");
        System.out.println("Automoviles atendidos: " + autos);
        System.out.printf("Dinero total recaudado: $%.2f%n", totalRecaudado);
        System.out.println("Automoviles con descuento: " + descuentos);

        if (autos > 0) {
            promedio = totalRecaudado / autos;
            System.out.printf("Promedio pagado por automovil: $%.2f%n", promedio);
        } else {
            System.out.println("No se atendieron automoviles.");
            System.out.println("No se puede calcular el promedio.");
        }
    }
}
