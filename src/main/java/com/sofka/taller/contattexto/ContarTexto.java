package com.sofka.taller.contattexto;

import com.sofka.taller.utilidades.Messages;
import com.sofka.taller.utilidades.MyScanner;

/**
 * Esta clase contiene una funcion para contar la cantidad de texto y de vocales
 * @author Mauricio Gómez - mmaurogg@gmail.com
 * @version 1.0.0 - 04 de junio de 2022
 */
public class ContarTexto {
    
    static Messages message = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    /**
     * Método para generar la instancia de la clase
     * @return new ContarTexto()
     */
    public static ContarTexto getInstance(){
        return new ContarTexto();
    }

    /**
     * Método que pide un texto por consola para despues imprimir:
     * <ul>
     * <li>Longitud de un texto sin espacios.</li>
     * <li>Longitud de un texto completo.</li>
     * <li>Cantidad de vocales a,e,i,o,u en un texto.</li>
     * </ul>
     */
    public void contatTexto() {

        message.showMessage("Ingrese un texto para contar longitud y sus vocales");
        String texto = scanner.getString();

        Integer txtImpr;
        // contar sin espacios
        String txtNuevo = texto.replace(" ","");
        txtImpr = txtNuevo.length();
        message.showMessage(msgTextoSinEspacios(txtImpr));
        
        // contar con espacios
        txtImpr = texto.length();
        message.showMessage(msgTextoCompleto(txtImpr));

        // contar vocales
        String letra;
        letra = "a";
        txtImpr = contarEnTexto(texto, letra);
        message.showMessage(msgvocales(txtImpr, letra));

        letra = "e";
        txtImpr = contarEnTexto(texto, letra);
        message.showMessage(msgvocales(txtImpr, letra));
        
        letra = "i";
        txtImpr = contarEnTexto(texto, letra);
        message.showMessage(msgvocales(txtImpr, letra));
        
        letra = "o";
        txtImpr = contarEnTexto(texto, letra);
        message.showMessage(msgvocales(txtImpr, letra));
        
        letra = "u";
        txtImpr = contarEnTexto(texto, letra);
        message.showMessage(msgvocales(txtImpr, letra));

    }

    /**
     * Cuenta el numero de caracteres pasado por parámetro en un texto o la longitud de este si no recibe segundo parámetro
     * @param texto texto a ser procesado para contar
     * @param caracter caracter que quiere ser contado (si es null devuelve longitud del texto)
     * @return numero de caracteres o longitud del texto
     */
    private Integer contarEnTexto(String texto, String compracion){
        
        Integer cuenta = 0;

        for (int i = 0; i < texto.length(); i++) {
            String elemento = String.valueOf(texto.charAt(i));
            if(elemento.equalsIgnoreCase(compracion)){
                cuenta++;
            }
        }

        return cuenta;

    }

    /**
     * Método que entrega el texto para imprimir cuando se analiza texto completo
     * @param txtImpr texto a imprimir
     * @return String con mensaje a imprimir
     */
    private static String msgTextoCompleto(Integer txtImpr){
        return "El texto completo tiene "+ txtImpr +" caracteres.";
    }

    /**
     * Método que entrega el texto para imprimir cuando se analiza texto sin espacios
     * @param txtImpr texto a imprimir
     * @return String con mensaje a imprimir
     */
    private static String msgTextoSinEspacios(Integer txtImpr){
        return "El texto sin espacios tiene "+ txtImpr +" caracteres.";
    }

    /**
     * Método que entrega el texto para imprimir cuando se cuentan las vocales en un texto
     * @param txtImpr texto a imprimir
     * @return String con mensaje a imprimir
     */
    private static String msgvocales(Integer txtImpr, String letra){
        return "El texto completo tiene "+ txtImpr +" letras " + letra;
    }

}
