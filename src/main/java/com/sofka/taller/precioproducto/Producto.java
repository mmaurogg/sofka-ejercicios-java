package com.sofka.taller.precioproducto;

/**
 * Esta clase crea un producto con sus valores
 * @author Mauricio Gómez - mmaurogg@gmail.com
 * @version 1.0.0 - 04 de junio de 2022
 */
public class Producto {

    private String nombre;
    private Double precioBase;
    private Double iva;
    private Double valorIva;
    private Double total;

    /**
     * Método constructor para crear un producto con nombre, precio y valor del iva
     */
    public Producto(String nombre, Double precioBase, Double iva) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.iva = iva;
        calcularIva();
        calcularTotal();
    }

    /**
     * Método que devuelve el nombre del producto
     * 
     * @return el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre
     * 
     * @param nombre nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el precio base (sin iva) del producto
     * 
     * @return el precio base (sin iva) del producto
     */
    public Double getPrecioBase() {
        return precioBase;
    }

    /**
     * Método para establecer el precio base (sni iva) del prodcuto
     * 
     * @param precioBase
     */
    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    /**
     * Método que devuelve el valor del IVA
     * 
     * @return el valor del IVA
     */
    public Double getIva() {
        return iva;
    }

    /**
     * Método para establecer el valor del IVA
     * 
     * @param iva el el valor del IVA
     */
    public void setIva(Double iva) {
        this.iva = iva;
    }

    /**
     * Método que devuelve el valor del iva del producto
     * 
     * @return el valor del iva del producto
     */
    public Double getValorIva() {
        return valorIva;
    }

    /**
     * Método que devuelve el valor total del producto
     * 
     * @return el valor total del producto
     */
    public Double getTotal() {
        return total;
    }

    /**
     * Método para calcular el valor del iva del prodcuto
     */
    private void calcularIva() {
        this.valorIva = this.iva / 100 * this.precioBase;
    }

    /**
     * Método para calcular el valor total del prodcuto (iva incluido)
     */
    private void calcularTotal() {
        this.total = this.precioBase + this.valorIva;
    }

}
