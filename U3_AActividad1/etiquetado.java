public class Main {

    public static void mostrarEtiqueta(int guia, String destino, double peso) {
        System.out.println("Numero de guia: " + guia);
        System.out.println("Ciudad de destino: " + destino);
        System.out.println("Peso del paquete: " + peso + " kg");
        System.out.println();
    }

    public static void main(String[] args) {

        mostrarEtiqueta(12345, "Cuernavaca", 5);
        mostrarEtiqueta(67890, "Puebla", 3);
    }
}
