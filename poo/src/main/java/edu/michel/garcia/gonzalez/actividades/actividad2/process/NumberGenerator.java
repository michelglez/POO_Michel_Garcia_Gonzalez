package edu.michel.garcia.gonzalez.actividades.actividad2.process;

import java.util.ArrayList;

public class NumberGenerator {
    /*
     * Genera los numeros pares de 0 al 100
     * 
     * @return Regresa una lista con los numeros pares
     * @throws Usa un bucle "for" para generar los numeros pares
     * 
     */

     public static void generadorNumeros() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i=0; i<=100; i+=2){
            lista.add(i);
        }
        System.out.println(lista);
     }
}
