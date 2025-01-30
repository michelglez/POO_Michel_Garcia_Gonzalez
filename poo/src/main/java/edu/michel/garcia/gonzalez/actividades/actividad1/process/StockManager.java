package edu.michel.garcia.gonzalez.actividades.actividad1.process;

import java.util.ArrayList;

import edu.michel.garcia.gonzalez.actividades.actividad1.models.Car;

import java.util.List;


public class StockManager {
ArrayList<Car> stock;

public StockManager(){
    this.stock = new ArrayList<>();
}

/**
 * @param modelo Versión específica del carro
 * @param marca Empresa productora del carro
 * @param numeroVentanas Cantidad de ventanas en el carro 
 * @param color Blanco,Rojo,Negro y Blanco 
 * @param addCar solicita los datos del carro
 */

public void addCar(String modelo, String marca,int numeroVentanas,String color){
    Car car= new Car(modelo, marca, numeroVentanas, color);
    stock.add(car);


}

/**
 * @return Devuelve una lista con el catalogo en memoria
 */

public List<Car> getStock(){
    return this.stock;
}

}
