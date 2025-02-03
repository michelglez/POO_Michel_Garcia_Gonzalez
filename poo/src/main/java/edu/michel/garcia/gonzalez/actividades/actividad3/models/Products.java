package edu.michel.garcia.gonzalez.actividades.actividad3.models;


public class Products {
/**
 * Clase que representa un producto, con información sobre su código, tipo, costo e impuestos.  
 *    
 * @param codigo Código del producto.  
 * @param tipo Tipo del producto.  
 * @param costo Costo del producto.  
 *  
 * @return Código del producto.  
 *   
 * @param codigo Nuevo código del producto.  
 *  
 * @return Tipo del producto.  
 *   
 * @param tipo Nuevo tipo del producto.  
 *  
 * @return Costo del producto.
 * @param costo Nuevo costo del producto.  
 *  
 * Calcula el precio de venta del producto considerando la utilidad y el impuesto.  
 * @param utilidad Porcentaje de utilidad en decimal (0.2 para 20%).  
 * @return Precio de venta del producto.  
 */


    private String codigo;
    private String tipo;
    private Double costo;
    private static final double impuesto = 16.0;

    public Products(String codigo, String tipo, double costo) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.costo = costo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getCosto() {
        return costo;
    }
    public double getImpuesto() {
        return impuesto;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public void muestraProducto() {
        System.out.println("Código: " + codigo);
        System.out.println("Tipo: " + tipo);
        System.out.println("Costo: $" + costo);
        System.out.println("Impuesto: $" + impuesto);
    }
    public double calcularPrecio(double utilidad) {
        double precioAntesImpuestos = costo + (costo * utilidad / 100);
        double montoImpuesto = precioAntesImpuestos * (impuesto / 100);
        return precioAntesImpuestos + montoImpuesto;


    }
}
