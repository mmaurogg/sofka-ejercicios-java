package com.sofka.taller.utilidades;

import java.util.List;

import org.jboss.logging.Logger;

/** 
 * Esta clase define todos los mensajes que se mostrarán en la app
 * @author Mauricio Gómez
 * @version 1.0.0
*/
public class Messages {
    
    private static final Logger logger = Logger.getLogger(Messages.class);

    /**
     * Método para instanciar la clase Messages
     * @return new Messages();
     */
    public static Messages getInstance(){
        return new Messages();
    }

    /**
     * Método para imprimir una cadena de String que reciba
     */
    public void showMessage(String message) {
        logger.info(message);
    }

    /**
     * método para imprimir números
     * @param number
     */
    public void showMessage(Integer number) {
        logger.info(number.toString());
    }
    
    /**
     * Método para imprimir una lista
     * @param list
     */
     public void showMessage(List<String> list) {
        logger.info(list);
    }


}