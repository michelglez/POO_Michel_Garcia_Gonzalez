package edu.michel.garcia.gonzalez.actividades.actividad3.process;
import edu.michel.garcia.gonzalez.actividades.actividad3.models.Products;

import java.util.List;
import java.util.ArrayList;



public class StockStore {
    private List<Products> stock;

    public StockStore() {
        stock = new ArrayList<>();
    }

    public void addProducts(String codigo, String tipo, double costo) {
        Products products = new Products(codigo, tipo, costo);
        stock.add(products);
    }

    public List<Products> getStock() {
        return stock;
    }

    public Products getProductsByCodigo(String codigo) {
        for (Products products : stock) {
            if (products.getCodigo().equals(codigo)) {
                return products;
            }
        }
        return null;
    }
}