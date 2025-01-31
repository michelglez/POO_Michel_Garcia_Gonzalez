package edu.michel.garcia.gonzalez.actividades.actividad2.ui;

import edu.michel.garcia.gonzalez.actividades.actividad2.process.NameValidator;
import edu.michel.garcia.gonzalez.actividades.actividad2.process.NumberGenerator;

import java.util.Scanner;


public class CLI {

    /**
     * Ejecuta la aplicacion principal desde la consola
     * Utilizando el metodo "Show Menu muestra al usuario el Menu"
     * Opciones:
     * 1. Solicita aal usuario ingresar un nombre y posteriormente valida que este en su base de datos
     * 2.Genera e imprime una lista de numeros paares del 0 al 100
     * 3.El Menu se repite hasta que el usuario elige la opcion de salida
     */

    public static void showMenu(){
        System.out.println("Menu");
        System.out.println("1. Validador de Nombres\n");
        System.out.println("2.Lista de numeros pares\n");
        System.out.println("3.Salir\n");
    
    }

    public static void runApp(){
        showMenu();
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();scanner.nextLine();

        while(opcion!= 3){
        switch(opcion) {
            case 1:
                System.out.println("Introduce un nombre: ");
                String name = scanner.nextLine();
                if(NameValidator.validateName(name)){
                   System.out.println("El nombre si existe en la Base de Datos");
                   System.out.println();
                }else{

               System.out.println("El nombre no existe en la Base de Datos");  
               System.out.println();
                }
                break;
               
            case 2:
                System.out.println("Generando lista de numeros pares ");
                NumberGenerator.generadorNumeros();
                System.out.println();
                break;


            default:
        }      
        showMenu();
        opcion = scanner.nextInt();scanner.nextLine();
       }
       System.out.println("Saliendo del programa");
       scanner.close();
    
    }

}
