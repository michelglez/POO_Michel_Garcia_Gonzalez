package edu.michel.garcia.gonzalez.actividades.actividad3.ui;

import edu.michel.garcia.gonzalez.actividades.actividad3.models.Products;
import edu.michel.garcia.gonzalez.actividades.actividad3.process.StockStore;

import java.util.Scanner;

public class CLI {

/**
 * Clase que proporciona una interfaz de línea de comandos (CLI) para gestionar el inventario de productos.  
 *  
 * Inicia la aplicación CLI y gestiona la interacción con el usuario.  
 * Presenta un menú y permite agregar, visualizar y comparar productos.  
 * Muestra el menú de opciones disponibles para el usuario.  
 *  
 * Permite comparar dos productos en el inventario según su código.  
 * @param stockstore Objeto StockStore que contiene el inventario de productos.  
 * @param args Argumentos de la línea de comandos
 */

    public static void runApp() {
       
        Scanner scanner = new Scanner(System.in);
        StockStore stockstore = new StockStore();
        showMenu();
        int opcion_menu = scanner.nextInt();
        scanner.nextLine();

        while (opcion_menu != 4) {
            switch (opcion_menu) {
                case 1:
                    System.out.println("Introduce el código del producto");
                    String codigo = scanner.nextLine();
                    System.out.println("Introduce el tipo de producto");
                    String tipo = scanner.nextLine();
                    System.out.println("Introduce el costo");
                    Double costo = scanner.nextDouble();
                    scanner.nextLine();

                    stockstore.addProducts(codigo, tipo, costo);
                    break;
                case 2: 
                    int product = 1;
                    for (Products products : stockstore.getStock()) {
                        System.out.println("Detalles del Producto " + product + ":");
                        System.out.println("-----------------------------------");
                        System.out.println("Código del producto: " + products.getCodigo());
                        System.out.println("Tipo de producto: " + products.getTipo());
                        System.out.println("Costo: $" + products.getCosto());
                        System.out.println("Impuesto: 16%");
                        System.out.println("-----------------------------------\n");
                        product++;
                    }
                    break;
                case 3:
                    compararProductos(stockstore);
                    break;
                default:
                    System.out.println("Opción no válida. Prueba de nuevo.");
            }
            showMenu();
            opcion_menu = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
    }

    public static void showMenu() {
        System.out.println("************************");
        System.out.println("*        MENÚ          *");
        System.out.println("************************");
        System.out.println("* 1. Agregar Producto *\n");
        System.out.println("* 2. Visualizar Productos *\n");
        System.out.println("* 3. Comparar         *\n");
        System.out.println("* 4. Salir            *\n");
        System.out.println("************************");
        System.out.print("Seleccione una opción: ");

    }
    
    public static void compararProductos(StockStore stockstore) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el código del primer producto para comparar");
        String codigo1 = scanner.nextLine();
        System.out.println("Introduce el código del segundo producto para comparar");
        String codigo2 = scanner.nextLine();

        Products p1 = stockstore.getProductsByCodigo(codigo1);
        Products p2 = stockstore.getProductsByCodigo(codigo2);

        if (p1 == null || p2 == null) {
            System.out.println("Uno o ambos productos no existen en el inventario.");
            return;
        }

        double precioP1 = p1.calcularPrecio(20.0);
        double precioP2 = p2.calcularPrecio(20.0); 

        if (precioP1 > precioP2) {
            System.out.println("El producto con mayor precio de venta es: " + p1.getCodigo() + " con un precio de $" + precioP1);
        } else if (precioP2 > precioP1) {
            System.out.println("El producto con mayor precio de venta es: " + p2.getCodigo() + " con un precio de $" + precioP2);
        } else {
            System.out.println("Ambos productos tienen el mismo precio de venta.");
        }
    }
}


    
