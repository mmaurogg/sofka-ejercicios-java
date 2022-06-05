package com.sofka.taller.remplazara;

import com.sofka.taller.utilidades.Messages;
import com.sofka.taller.utilidades.MyScanner;

/**
 * Esta clase cambia las letras "a" por "e" en un texto
 * @author Mauricio Gómez - mmaurogg@gmail.com
 * @version 1.0.0 - 04 de junio de 2022
 */
public class ReemplazarA {

    static final String TEXTO = "La sonrisa sera la mejor arma contra la tristeza"; 
    String letraCambio = "a";
    String letraNueva = "e";

    static Messages message = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    /**
     * Método para generar la instancia de la clase
     * @return new ReemplazarA()
     */
    public static ReemplazarA getInstance(){
        return new ReemplazarA();
    }
    
    /**
     * Metodo para mostrar mensaje de los cambios realizados en un textos de las letras "a" por "e"
     */
    public void cambiar(){
        message.showMessage(reemplazar(TEXTO));
    }

    /**
     * Método para realizar el cambio de las letras las letras "a" por "e"
     * @param texto Texto al que se le quiere realizar el cambio
     * @return texto con el cambio realizado (las letras "a" por "e")
     */
    private String reemplazar(String texto) {
        return texto.replace(letraCambio,letraNueva);
        
    }


}
