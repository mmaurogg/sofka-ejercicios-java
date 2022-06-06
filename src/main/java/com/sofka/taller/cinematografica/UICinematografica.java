package com.sofka.taller.cinematografica;

import com.sofka.taller.utilidades.Messages;
import com.sofka.taller.utilidades.MyScanner;

/** 
 * Esta clase contiene el menú para comparacíon de dos números
 * @author Mauricio Gómez - mmaurogg@gmail.com
 * @version 1.0.0 - 04 de junio de 2022
*/
public class UICinematografica {
    
    static Messages message = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();
    
    /**
     * Método para generar la instancia de la clase
     * @return new UICinematografica()
     */
    public static UICinematografica getInstance(){
        return new UICinematografica();
    }

    /**
     * Método para desplegar el menú de gestión de preguntas
     */
    public void gestionCinema() {

        String[] mensajes = {
            "****** GESTION CINEMATOGRÁFICA ********",
            "1-NUEVO ACTOR",
            "2-BUSCAR ACTOR",
            "3-ELIMINAR ACTOR",
            "4-MODIFICAR ACTOR",
            "5-VER TODOS LOS ACTORES",
            "6- VER PELICULAS DE LOS ACTORES",
            "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES",
            "8-SALIR"            
        };

        int seleccion = 8;
        do {
            for (String mensaje : mensajes) {
                message.showMessage(mensaje);
            };

            try {
                seleccion = scanner.getInteger();
            } catch (Exception e) {
                message.showMessage("ERROR: Debe ingresar un valor numerico");
            }
            
            if( seleccion < 1 || seleccion > 9){
                message.showMessage("OPCION INCORRECTA");
            } else {
                message.showMessage("Ha seleccionado la opción: " + mensajes[seleccion]);
            }
            
        } while (seleccion != 8);

    }


}

