package com.sofka.taller.contadornumeros;

import java.util.ArrayList;

import com.sofka.taller.utilidades.Messages;

/**
 * Esta clase contiene una funcion para contar la cantidad de numeros pares e impares entre 1 y 100
 * @author Mauricio Gómez - mmaurogg@gmail.com
 * @version 1.0.0 - 04 de junio de 2022
 */
public class ContadorFor {
    
    static Messages message = Messages.getInstance();
    /**
     * Funcion que cuenta los numeros pares e impares entre 1 y 100
     */
    public void contarNumeros(){
        
        ArrayList<Integer> pares = new ArrayList<Integer>();
        ArrayList<Integer> inpares = new ArrayList<Integer>();

        for (int i = 1; i < 101; i++) {
            
            if(Boolean.TRUE.equals(esPar(i))){
                pares.add(i);
            }else {
                inpares.add(i);
            }
        }

        message.showMessage("Los numeros pares son:\n"+ pares);
        message.showMessage("Los numeros inpares son:\n"+ inpares);
    }

    /**
     * Función para comprobar si un número es par
     * @param i es el número a evaluar
     * @return true o false tipo Boolean
     */
    private Boolean esPar(Integer i){
        Integer modulo = i%2; 
        return (modulo.equals(0))?true:false;
    }
}
