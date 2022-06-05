package com.sofka.taller.eliminarespacio;

import com.sofka.taller.utilidades.Messages;
import com.sofka.taller.utilidades.MyScanner;

/**
 * Esta clase que contiene función para eliminar espacios de un texto ingresado
 * @author Mauricio Gómez - mmaurogg@gmail.com
 * @version 1.0.0 - 04 de junio de 2022
 */
public class EliminarEspacio {
    
    static Messages message = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    /**
     * Método para generar la instancia de la clase
     * @return new EliminarEspacio()
     */
    public static EliminarEspacio getInstance(){
        return new EliminarEspacio();
    }

    /**
     * Método que pide un texto por consola para despues eliminar los espacios
     */
    public void quitarEspacio(){

        message.showMessage("Ingrese un texto para quitar los espacios");
        String texto = scanner.getString();

        String txtNuevo = texto.replace(" ","");

        message.showMessage(txtNuevo);
    }

}
