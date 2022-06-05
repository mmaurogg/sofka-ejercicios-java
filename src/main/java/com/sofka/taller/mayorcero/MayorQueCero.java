package com.sofka.taller.mayorcero;

import com.sofka.taller.utilidades.Messages;
import com.sofka.taller.utilidades.MyScanner;

/**
 * Esta clase contiene una función que imprime un valor ingresado por consola siempre que sea mayor que cero
 * @author Mauricio Gómez - mmaurogg@gmail.com
 * @version 1.0.0 - 04 de junio de 2022
 */
public class MayorQueCero {
    
    static Messages message = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    public static MayorQueCero getInstance(){
        return new MayorQueCero();
    } 
    /**
     * Función para imprimir valores mayores a cero
     */
    public void imprimirNumeroMayorQueCero(){
        Integer respuesta = -1;
        do {
            try{
                message.showMessage("Ingrese numero mayor o igual a cero: ");
                respuesta = scanner.getInteger();
            } catch (Exception e) {
                message.showMessage("Debe introducir un valor numérico");
            }

        } while (respuesta < 0);

        message.showMessage(String.valueOf(respuesta));

    }

}
