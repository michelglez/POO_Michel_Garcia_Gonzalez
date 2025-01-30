package edu.michel.garcia.gonzalez.actividades.actividad1.models;

public class Car {
    private String modelo;

    private String marca;

    private int numVentanas;

    private String color;

    /** 
     * @return Regresa el mensaje de car en los datos
    */


    @Override
    public String toString() {
        return "Car{" +
        "modelo='" + modelo + '\'' +
        ", marca='" + marca + '\'' +
        ",numeroVentanas=" + numVentanas +
        ", color=" + color + '\'' + 
        '}';
    }

    public Car(String modelo, String marca, int numeroVentanas, String color){
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        setNumeroVentanas(numeroVentanas);

    }

    public int getNumeroVentanas(){
        return numVentanas; 
    }

    /**
     * @return color Regresa el color del carro
     * @return marca Regresa la marca del carro
     * @return modelo Regresa el modelo del carro
     * @return numero de ventanas Regresa las cantidad de ventanas
     * @throws manda mensaje si esta vacia version carro
     */

     public void setNumeroVentanas(int numeroVentanas) {
        if(numeroVentanas<2 || numeroVentanas>8){
            throw new IllegalArgumentException("Numero de ventanas valido entre 2 y 8");
     }

     this.numVentanas = numeroVentanas;
    }

    public String getModelo(){
        return modelo;
    }

    public void SetModelo (String modelo){
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }

    public void SetMarca (String marca){
        this.marca = marca;
    }

    public String getColor(){
        return color;
    }

    public void SetColor (String color){
        this.color = color;
    }

}
