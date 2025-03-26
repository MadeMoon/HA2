import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Inventario");

        int seleccion;

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> producto = new ArrayList<>();
        ArrayList<Double> precios = new ArrayList<>();

        do{
        System.out.println("Acción");
        System.out.println("1. Agregar Producto");
        System.out.println("2. Mostrar Productos");
        System.out.println("3. Actualizar Cantidad de un Producto");
        System.out.println("4. Eliminar Producto");
        System.out.println("5. Salir");
        System.out.print("Ingrese el número de opción: ");
        seleccion = scanner.nextInt();
        scanner.nextLine();


        if (seleccion == 1){

            System.out.println("Ingrese Nombre del Nuevo Producto: ");
            String productoNuevo = scanner.nextLine();

            final double IVA = 0.12;

            System.out.println("Ingrese el Precio del Producto");
            double precioProducto = scanner.nextDouble();
            scanner.nextLine();

            producto.add(productoNuevo);
            precios.add(precioProducto);

            System.out.println("Se registro correctamente: " + productoNuevo + ", Total IVA: " + precioProducto * IVA);
            System.out.println(" ");


            }
        if (seleccion == 2) {
            System.out.println(" ");

            System.out.println("Los productos almacenados son: ");
            for (String inventario : producto) {
                System.out.println(inventario);


            }
            if  (seleccion == 3) {
                System.out.println("-------Modificar--------");
                int modificarProducto = scanner.nextInt();
                System.out.println("Ingrese el nombre que desea modificar: ");
                String itemModificado = scanner.nextLine();

                producto.set(modificarProducto, itemModificado);

            }
            }
        if (seleccion == 4) {

            System.out.println("Ingrese el número del Producto a Eliminar: ");
            int eliminarProducto = scanner.nextInt();
            scanner.nextLine();

            if (eliminarProducto >= 0 && eliminarProducto < producto.size()) {
                producto.remove(eliminarProducto);
                precios.remove(eliminarProducto);
                System.out.println("Producto eliminado correctamente.");
            } else {
                System.out.println("Índice de producto no válido.");
            }


        }

        } while (seleccion !=5);

        scanner.close();
    }
}
