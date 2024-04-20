package mx.utng.p1;

import java.util.Scanner;

public class TiendaMusica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la tienda de música.");
        System.out.print("Ingrese el monto total de la compra: $");
        double totalCompra = scanner.nextDouble();

        double descuento = 0.0;
        if (totalCompra > 100) {
            descuento = totalCompra * 0.10;
        }

        double totalPagar = totalCompra - descuento;

        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalPagar);

        scanner.close();
    }
}