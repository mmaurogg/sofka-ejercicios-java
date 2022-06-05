package com.sofka.taller.precioproducto;

import java.text.DecimalFormat;

import com.sofka.taller.utilidades.Messages;
import com.sofka.taller.utilidades.MyScanner;

/**
 * Esta clase contiene el menú para la creación de un producto
 * @author Mauricio Gómez - mmaurogg@gmail.com
 * @version 1.0.0 - 04 de junio de 2022
 */
public class UIProducto {

    final static double IVA = 21;

    static Messages message = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    static DecimalFormat formato = new DecimalFormat("#.00");

    public static UIProducto getInstance(){
        return new UIProducto();
    } 

    /**
     * Funcion que despliega el menú
     */
    public void menuProducto() {

        Boolean flag = true;
        Producto producto;

        while (Boolean.TRUE.equals(flag)) {

            try {
                message.showMessage("Bienvenido a su creador de productos");

                producto = crearProducto(IVA);

                mostrarProducto(producto);

                message.showMessage("¿Desea crear otro producto? (y/n)?");
                String confirmacion = scanner.getString();

                if ("n".equalsIgnoreCase(confirmacion)) {
                    flag = false;
                }

            } catch (Exception e) {
                message.showMessage("error en la entrada de datos");
            }

        }

    }

    /**
     * Método para crear un producto
     * definido por entrada
     * 
     * @return La instancia de un circulo
     */
    private static Producto crearProducto(Double iva) {

        message.showMessage("¿¿Nombre del producto que desea crear??");
        String nombre = scanner.getString();

        message.showMessage("ingrese el precio base");
        Double precioBase = scanner.getDouble();

        return new Producto(nombre, precioBase, iva);
    }


    private static void mostrarProducto(Producto producto) {

        String nombre = producto.getNombre();
        String precioBase = formato.format(producto.getPrecioBase());
        String valorIva = formato.format(producto.getValorIva());
        String valorTotal = formato.format(producto.getTotal());
        
        message.showMessage("\nHa creado el producto: " + nombre
                + "\nPrecio base: " + precioBase
                + "\nValor IVA: " + valorIva
                + "\nValor total " + valorTotal);
    }

}