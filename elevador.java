import java.util.Scanner;

public class elevador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int actual, destino, piso;

        System.out.print("En que piso estas: ");
        actual = teclado.nextInt();

        while (actual < 1 || actual > 10) {
            System.out.print("el piso no es valido, ingresa otro: ");
            actual = teclado.nextInt();
        }

        System.out.print("A que piso quieres ir: ");
        destino = teclado.nextInt();

        while (destino < 1 || destino > 10 || destino == actual) {
            System.out.print("el piso no es valido, ingresa otro: ");
            destino = teclado.nextInt();
        }

        if (destino > actual) {
            System.out.println("Subiendo");
            piso = actual + 1;

            while (piso <= destino) {
                System.out.print(piso);

                if (piso < destino) {
                    System.out.print(", ");
                }
                piso++;
            }

        } else {
            System.out.println("Bajando");
            piso = actual;

            while (piso >= destino) {
                System.out.print(piso);

                if (piso > destino) {
                    System.out.print(", ");
                }
                piso--;
            }
        }
    }
}