//jose santiago quezada peralta

import java.util.Scanner;

public class examenU2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int peso;
        int tipo;
        int fragil;

        int aceptados = 0;
        int rechazados = 0;
        int fragiles = 0;

        double dinero = 0;
        double costo;
        double costoAlto = 0;

        System.out.println("CENTRO DE PAQUETERIA");

        System.out.println("Ingrese el peso del paquete en kg.");
        System.out.println("Ingrese 0 para terminar.");

        System.out.print("Peso: ");
        peso = teclado.nextInt();

        while (peso != 0) {

            while (peso < 0) {
                System.out.println("Peso incorrecto. Intente de nuevo.");
                System.out.print("Peso: ");
                peso = teclado.nextInt();
            }

            if (peso == 0) {
                break;
            }

            System.out.println("Tipo de envio:");
            System.out.println("1. Local");
            System.out.println("2. Nacional");
            System.out.println("3. Express");

            do {
                System.out.print("Seleccione una opcion: ");
                tipo = teclado.nextInt();

                if (tipo < 1 || tipo > 3) {
                    System.out.println("Opcion no valida.");
                }

            } while (tipo < 1 || tipo > 3);

            int maximo = 0;

            if (tipo == 1) {
                maximo = 12;
            } else if (tipo == 2) {
                maximo = 20;
            } else if (tipo == 3) {
                maximo = 5;
            }

            if (peso > maximo) {

                System.out.println("Paquete rechazado.");
                rechazados++;

            } else {

                if (tipo == 1) {
                    costo = 30 + (8 * peso);
                } else if (tipo == 2) {
                    costo = 50 + (12 * peso);
                } else {
                    costo = 80 + (20 * peso);
                }

                do {
                    System.out.println("¿El paquete es fragil?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    System.out.print("Seleccione: ");
                    fragil = teclado.nextInt();

                    if (fragil != 1 && fragil != 2) {
                        System.out.println("Opcion no valida.");
                    }

                } while (fragil != 1 && fragil != 2);

                if (fragil == 1) {
                    costo = costo + 25;
                    fragiles++;
                }

                aceptados++;
                dinero = dinero + costo;

                if (costo > costoAlto) {
                    costoAlto = costo;
                }

                System.out.println("PAQUETE ACEPTADO");

                if (tipo == 1) {
                    System.out.println("Tipo: Local");
                } else if (tipo == 2) {
                    System.out.println("Tipo: Nacional");
                } else {
                    System.out.println("Tipo: Express");
                }

                System.out.println("Peso: " + peso + " kg");
                System.out.println("Total a pagar: $" + costo);
            }

            System.out.println("-------------------------");
            System.out.print("Peso del siguiente paquete (0 para terminar): ");
            peso = teclado.nextInt();
        }

        System.out.println("===== RESULTADOS FINALES =====");

        System.out.println("Paquetes aceptados: " + aceptados);
        System.out.println("Paquetes rechazados: " + rechazados);
        System.out.println("Paquetes fragiles aceptados: " + fragiles);
        System.out.println("Dinero recaudado: $" + dinero);
        System.out.println("Costo mas alto: $" + costoAlto);
    }
}
