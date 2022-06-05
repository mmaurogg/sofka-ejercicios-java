package com.sofka.taller.comparacionnumeros;

/** 
 * Esta clase contiene una funcion que compara dos numeros y devuelve cual es mayor
 * @author Mauricio Gómez - mmaurogg@gmail.com
 * @version 1.0.0 - 04 de junio de 2022
*/
public class Comparador {
    
    /**
     * Funcion que compara dos numeros e indica cual es mayor o si son iguales
     * @param primerNumero la primera posición que ocupa el número recibido
     * @param segundoNumero la segunda posición que ocupa el número recibido
     * @return String con la posicion del número mayor 
     */
    public String compararNumero(Integer primerNumero, Integer segundoNumero){
        
        String respuesta = "";
        
        if( primerNumero.equals(segundoNumero)){
            respuesta = "Los dos números son iguales";
        } else if(primerNumero > segundoNumero){
            respuesta =  "El primer número es mayor que el segundo";
        } else {
            respuesta = "El segundo número es mayor que el primero";
        }

        return respuesta;

    }

}
