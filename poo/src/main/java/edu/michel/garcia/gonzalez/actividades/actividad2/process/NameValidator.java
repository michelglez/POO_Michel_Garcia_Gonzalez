package edu.michel.garcia.gonzalez.actividades.actividad2.process;

import static edu.michel.garcia.gonzalez.actividades.actividad2.data.Data.nombres;


public class NameValidator {
    /*
     * Este metodo verifica que el nombre proporcionado por el ususario esta en el arreglo
     * La comparacion se realiza sin importar las mayusculas o minusculas
     * 
     * @param name El nombre que se desea checar
     * @return true si el nombre se encuentra dentro de la lista y false en caso contrario
     */

    public static boolean validateName(String name){
    boolean valid = false;
    int index = 0;
        while(!valid && index<nombres.length) {
            if(nombres[index].equalsIgnoreCase(name)){
                valid = true;
            }
            index++;
        }
        return valid; 
    }

}