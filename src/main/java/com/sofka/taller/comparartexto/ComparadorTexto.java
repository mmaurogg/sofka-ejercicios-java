package com.sofka.taller.comparartexto;

import java.util.HashMap;

import com.sofka.taller.utilidades.Messages;
import com.sofka.taller.utilidades.MyScanner;

/** 
 * Esta clase contiene una funcion que compara dos palabras y devuelve sus diferencias
 * @author Mauricio Gómez - mmaurogg@gmail.com
 * @version 1.0.0 - 04 de junio de 2022
*/
public class ComparadorTexto {
    
    static Messages message = Messages.getInstance();
    static MyScanner scanner = MyScanner.getInstance();

    /**
     * Método para generar la instancia de la clase
     * @return new DiaSemana()
     */
    public static ComparadorTexto getInstance(){
        return new ComparadorTexto();
    }
    

    /**
     * Método para que pide las palabras a comparar y ejecuta la comparación
     */
    public void compararTexto() {

        message.showMessage("Ingrese la primera palabra");
        String primerTexto = scanner.getString();
    
        message.showMessage("Ingrese la segunda palabra");
        String segundoTexto = scanner.getString();

        if(primerTexto.equals(segundoTexto)){
            message.showMessage("Las dos palabras son iguales");
        }

        verDiferencias(primerTexto, segundoTexto);
    
    }

    /**
     * Método para buscar las letras diferentes y sus prespectivas paosiciones
     * @param primerTexto primera palabra a comparar
     * @param segundoTexto segunda palabra a comparar
     */
    private void verDiferencias(String primerTexto, String segundoTexto){

        HashMap<Integer, String> difPrimerTexto = new HashMap<Integer, String>();
        HashMap<Integer, String> difSegundoTexto = new HashMap<Integer, String>();

        String longitudTexto = (primerTexto.length() > segundoTexto.length())?primerTexto:segundoTexto;

        for (int i = 0; i < longitudTexto.length(); i++) {
            String primerElemento = String.valueOf(primerTexto.charAt(i));
            String segundoElemento = String.valueOf(segundoTexto.charAt(i));

            if(!primerElemento.equals(segundoElemento)){
                difPrimerTexto.put(i,primerElemento);                
                difSegundoTexto.put(i,segundoElemento);
            }
        }

        message.showMessage("Las diferencias son " + difPrimerTexto.values());
        message.showMessage("Las diferencias son " + difSegundoTexto.values());
        message.showMessage("En las posiciones " + difPrimerTexto.keySet());
    }
}
