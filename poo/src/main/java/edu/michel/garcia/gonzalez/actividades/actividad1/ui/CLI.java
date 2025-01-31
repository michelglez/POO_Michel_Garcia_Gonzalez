package edu.michel.garcia.gonzalez.actividades.actividad1.ui;



import java.util.Scanner;

import edu.michel.garcia.gonzalez.actividades.actividad1.models.Car;
import edu.michel.garcia.gonzalez.actividades.actividad1.process.StockManager;

/**
 * @param scanner Registra la informacion del carro
 */

public class CLI {
    public static void runApp() {
        Scanner scanner = new Scanner(System.in);
        StockManager stockmanager = new StockManager();
        showMenu();
        int opcion = scanner.nextInt();
        scanner.nextLine();

        while (opcion !=3){
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el numero de ventanas");
                    int numVentanas = scanner.nextInt(); scanner.nextLine(); 
                    System.out.println("Introduce el modelo");
                    String modelo =scanner.nextLine();
                    System.out.println("Introduce el color");
                    String color =scanner.nextLine();
                    System.out.println("Introduce la marca");
                    String marca =scanner.nextLine();
                    stockmanager.addCar(modelo,marca,numVentanas,color);
                    break;
                case 2:
                   int auto=1;
                    for(Car car : stockmanager.getStock()){
                        System.out.println("Auto"+auto+":");
                        System.out.println("    Modelo: \n" +car.getModelo());
                        System.out.println("    Color: \n" +car.getColor ());
                        System.out.println("    Numero de Ventanas: \n" +car.getNumeroVentanas());
                        System.out.println("    Marca: \n" +car.getMarca ());
                        auto++;
                    } 
                    break;
                default:
                    System.out.println("Opción no valida");
                    
            }
            showMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
        }

    }


    public static void showMenu(){
        System.out.println("Menu");
        System.out.println("1. Agregar Carro al catalogo");
        System.out.println("2. Mostrar catalogo");
        System.out.println("3. Salir");
    }
    
}   