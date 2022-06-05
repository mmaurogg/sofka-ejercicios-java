package com.sofka.taller.numamil;

import com.sofka.taller.utilidades.Messages;
import com.sofka.taller.utilidades.MyScanner;

/** 
 * Esta clase contiene una funcion que compara dos palabras y devuelve sus diferencias
 * @author Mauricio Gómez - mmaurogg@gmail.com
 * @version 1.0.0 - 04 de junio de 2022
*/
public class NumeroHAstaMil {
    
    static Messages message = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    /**
     * Método para generar la instancia de la clase
     * @return new DiaSemana()
     */
    public static NumeroHAstaMil getInstance(){
        return new NumeroHAstaMil();
    }

    /**
     * Método para imprimir los numeros de un numero n introducido por teclado hasta 1000 con un salto de 2.
     */
    public void imprimirNumeros(){

        message.showMessage("Bienvenivo imprimiré un número de n hasta 1000 con salto de 2");
        message.showMessage("ingrese a n");
        Integer numero = scanner.getInteger();

        for (int i = numero; i < 1001; i+=2) {
            message.showMessage(i);
        }

    }
}
