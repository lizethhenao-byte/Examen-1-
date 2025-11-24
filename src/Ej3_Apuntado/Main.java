import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productos = {"Leche", "Pan", "Huevos", "Arroz", "Azúcar"};
        double[] precios = {3500, 2500, 12000, 4000, 2800};
        int[] cantidades = new int[productos.length];

        System.out.println("=== Sistema de Compra ===");

        for (int i = 0; i < productos.length; i++) {
            System.out.print("Ingrese la cantidad de " + productos[i] + ": ");
            cantidades[i] = scanner.nextInt();
        }

        double total = 0;

        System.out.println("\n=== Factura ===");
        for (int i = 0; i < productos.length; i++) {
            double subtotal = precios[i] * cantidades[i];
            System.out.println(productos[i] + " x " + cantidades[i] + " = $" + subtotal);
            total += subtotal;
        }

        System.out.println("\nTotal a pagar: $" + total);

        scanner.close();
    }
}
