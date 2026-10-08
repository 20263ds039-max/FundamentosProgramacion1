import java.util.Scanner;

public class RentaBicicletas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcion, horas;
        double tarifa = 0, subtotal, descuento, total;
        String tipo = "";
        boolean membresia;

        System.out.println("RENTA DE BICICLETAS");
        System.out.println("1. Urbana - $40 por hora");
        System.out.println("2. Montaña - $60 por hora");
        System.out.println("3. Eléctrica - $90 por hora");

        System.out.print("Elige una opción: ");
        opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                tipo = "Urbana";
                tarifa = 40;
                break;
            case 2:
                tipo = "Montaña";
                tarifa = 60;
                break;
            case 3:
                tipo = "Eléctrica";
                tarifa = 90;
                break;
            default:
                System.out.println("Opción no válida");
        }

        if (opcion >= 1 && opcion <= 3) {
            System.out.print("Horas de renta: ");
            horas = teclado.nextInt();

            if (horas > 0) {
                System.out.print("¿Tiene membresía? (true/false): ");
                membresia = teclado.nextBoolean();

                subtotal = tarifa * horas;

                if (membresia) {
                    descuento = subtotal * 0.20;
                } else {
                    descuento = 0;
                }

                total = subtotal - descuento;

                System.out.println("Tipo de bicicleta: " + tipo);
                System.out.println("Subtotal: $" + subtotal);
                System.out.println("Descuento: $" + descuento);
                System.out.println("Total a pagar: $" + total);

            } else {
                System.out.println("Cantidad de horas no válida");
            }
        }
    }
}