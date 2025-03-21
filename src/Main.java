import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Inventario");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese Nombre del Producto Nuevo: ");
        String productoNuevo = scanner.nextLine();

        System.out.println("Ingrese Precio del Producto");
        int precioProducto = scanner.nextInt();

        System.out.println("cantidad");
        int cantidad = scanner.nextInt();

        scanner.close();
    }
}