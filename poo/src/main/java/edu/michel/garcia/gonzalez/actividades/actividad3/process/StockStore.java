package edu.michel.garcia.gonzalez.actividades.actividad3.process;
import edu.michel.garcia.gonzalez.actividades.actividad3.models.Products;

import java.util.List;
import java.util.ArrayList;


public class StockStore {

/**
 * Clase que maneja el inventario de productos.  
 * Constructor de la clase StockStore.  
 * Inicializa la lista de productos en stock.  
 *    
 * @param codigo Código del producto.  
 * @param tipo Tipo del producto.  
 * @param costo Costo del producto.  
 *   
 * @return Lista de productos disponibles en el inventario.  
 * Busca un producto en el inventario por su código.  
 * @param codigo Código del producto a buscar.  
 * @return Producto encontrado o null si no existe en el inventario.  
 */
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